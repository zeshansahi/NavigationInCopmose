# Simple navigation graph implementation concept

## Branches

- main
- nestedNavigation

### main

- This [branch](https://github.com/zeshansahi/NavigationInCopmose) is simple navigation and passing
  the argument from one destination to other

### nestedNavigation

- This [branch](https://github.com/zeshansahi/NavigationInCopmose/tree/nestedNavigation) demonstrate
  the nested navigation

### Simple Navigation Graph

``` 
sealed class Screens(val rout:String) {
    object Home:Screens("home_scree")
    object Detail:Screens("home_scree")
}
```

### graph for simple navigation

```
@Composable
fun NavGraphSetup(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Home.rout
    ) {
        composable(
            route = Screens.Home.rout
        ) {
            HomeScreen(navController)
        }
        composable(
            route = Screens.Detail.rout
        ) {
            DetailScreen(navController)
        }
    }
}
```

### Argument Navigation Graph

```
const val DETAIL_ARGUMENT_ID = "id"

const val DETAIL_ARGUMENT_NAME = "name"
 

sealed class Screens(val rout: String) {
    object Home : Screens("home_screen")
    object Detail : Screens("detail_screen?id={$DETAIL_ARGUMENT_ID}&name={$DETAIL_ARGUMENT_NAME}") {
        fun passArguments(id: Int, name: String): String {
            return "detail_screen?id=$id&name=$name"
        }
    }
}
```

## if we want to pass argument then we will use like this

### graph for passing argument

``` 
@Composable
fun NavGraphSetup(navController: NavHostController) {
    NavHost(
        navController = navController, startDestination = Screens.Home.rout
    ) {
        composable(
            route = Screens.Home.rout
        ) {
            HomeScreen(navController)
        }
        composable(route = Screens.Detail.rout, arguments = listOf(navArgument(DETAIL_ARGUMENT_ID) {
            type = NavType.IntType
            defaultValue = 0
        }, navArgument(DETAIL_ARGUMENT_NAME) {
            type = NavType.StringType
        })) {
            Log.e(TAG, "NavGraphSetup: ${it.arguments?.getInt(DETAIL_ARGUMENT_ID).toString()}")
            Log.e(TAG, "NavGraphSetup: ${it.arguments?.getString(DETAIL_ARGUMENT_NAME).toString()}")
            DetailScreen(navController)
        }
    }
}
```