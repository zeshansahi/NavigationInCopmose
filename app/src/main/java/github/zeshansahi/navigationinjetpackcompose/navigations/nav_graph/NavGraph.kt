package github.zeshansahi.navigationinjetpackcompose.navigations.nav_graph

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import github.zeshansahi.navigationinjetpackcompose.navigations.DETAIL_ARGUMENT_ID
import github.zeshansahi.navigationinjetpackcompose.navigations.DETAIL_ARGUMENT_NAME
import github.zeshansahi.navigationinjetpackcompose.navigations.HOME_GRAPH_ROUTE
import github.zeshansahi.navigationinjetpackcompose.navigations.ROOT_GRAPH_ROUTE
import github.zeshansahi.navigationinjetpackcompose.navigations.Screens
import github.zeshansahi.navigationinjetpackcompose.viewScreens.DetailScreen
import github.zeshansahi.navigationinjetpackcompose.viewScreens.HomeScreen

private const val TAG = "NavGraph"

@Composable
fun NavGraphSetup(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HOME_GRAPH_ROUTE,
        route = ROOT_GRAPH_ROUTE
    ) {

    }
}