# Simple navigation graph implementation concept

### Constants for navigation and rout class

```
const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

const val ROOT_GRAPH_ROUTE = "root"
const val AUTH_GRAPH_ROUTE = "auth"
const val HOME_GRAPH_ROUTE = "home"
```

```
sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Detail : Screen(route = "detail_screen?id={id}&name={name}") {
        fun passNameAndId(
            id: Int = 0,
            name: String = "Stevdza-San"
        ): String {
            return "detail_screen?id=$id&name=$name"
        }
    }
    object Login: Screen(route = "login_screen")
    object SignUp: Screen(route = "sign_up_screen")
}
```

### Main NavGraph

``` 
@Composable
fun NavGraphSetup(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HOME_GRAPH_ROUTE,
        route = ROOT_GRAPH_ROUTE
    ) {
        homeNavGraph(navController)
        authNavGraph(navController)
    }
}
```

### Auth Nested NavGraph

``` 
fun NavGraphBuilder.authNavGraph(
    navHostController: NavHostController
) {
    navigation(
        startDestination = Screens.Longin.rout,
        route = AUTH_GRAPH_ROUTE
    ) {
        composable(route = Screens.Longin.rout) {
            LoginScreen(navHostController = navHostController)
        }
        composable(route = Screens.Signup.rout) {
            SignupScreen(navHostController = navHostController)
        }
    }
}
```

### Home navGraph

``` 
fun NavGraphBuilder.homeNavGraph(
    navHostController: NavHostController
) {
    navigation(
        startDestination = Screens.Home.rout,
        route = HOME_GRAPH_ROUTE
    ) {
        /*  composable(route = Screens.Home.rout) {
              HomeScreen(navHostController = navHostController)
          }
          composable(route = Screens.Detail.rout) {
              HomeScreen(navHostController = navHostController)
          }*/

        composable(
            route = Screens.Home.rout
        ) {
            HomeScreen(navHostController)
        }
        composable(route = Screens.Detail.rout, arguments = listOf(navArgument(DETAIL_ARGUMENT_ID) {
            type = NavType.IntType
            defaultValue = 0
        }, navArgument(DETAIL_ARGUMENT_NAME) {
            type = NavType.StringType
        })) {
            Log.e(TAG, "NavGraphSetup: ${it.arguments?.getInt(DETAIL_ARGUMENT_ID).toString()}")
            Log.e(TAG, "NavGraphSetup: ${it.arguments?.getString(DETAIL_ARGUMENT_NAME).toString()}")
            DetailScreen(navHostController)
        }
    }

}
```