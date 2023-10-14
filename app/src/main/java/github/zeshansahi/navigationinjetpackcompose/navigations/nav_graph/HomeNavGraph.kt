package github.zeshansahi.navigationinjetpackcompose.navigations.nav_graph

import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import github.zeshansahi.navigationinjetpackcompose.navigations.DETAIL_ARGUMENT_ID
import github.zeshansahi.navigationinjetpackcompose.navigations.DETAIL_ARGUMENT_NAME
import github.zeshansahi.navigationinjetpackcompose.navigations.HOME_GRAPH_ROUTE
import github.zeshansahi.navigationinjetpackcompose.navigations.Screens
import github.zeshansahi.navigationinjetpackcompose.viewScreens.DetailScreen
import github.zeshansahi.navigationinjetpackcompose.viewScreens.HomeScreen

private const val TAG = "HomeNavGraph"
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