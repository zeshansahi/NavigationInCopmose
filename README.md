# NavigationInCopmose

### Simple Navigation Graph
```agsl
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
