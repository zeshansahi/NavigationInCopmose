package github.zeshansahi.navigationinjetpackcompose.navigations.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import github.zeshansahi.navigationinjetpackcompose.navigations.HOME_GRAPH_ROUTE
import github.zeshansahi.navigationinjetpackcompose.navigations.ROOT_GRAPH_ROUTE

private const val TAG = "NavGraph"

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