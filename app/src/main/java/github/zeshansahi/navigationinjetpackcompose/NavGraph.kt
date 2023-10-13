package github.zeshansahi.navigationinjetpackcompose

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

private const val TAG = "NavGraph"

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