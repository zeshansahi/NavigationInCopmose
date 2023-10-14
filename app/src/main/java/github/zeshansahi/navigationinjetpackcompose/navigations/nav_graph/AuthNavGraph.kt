package github.zeshansahi.navigationinjetpackcompose.navigations.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import github.zeshansahi.navigationinjetpackcompose.navigations.AUTH_GRAPH_ROUTE
import github.zeshansahi.navigationinjetpackcompose.navigations.Screens
import github.zeshansahi.navigationinjetpackcompose.viewScreens.LoginScreen
import github.zeshansahi.navigationinjetpackcompose.viewScreens.SignupScreen

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