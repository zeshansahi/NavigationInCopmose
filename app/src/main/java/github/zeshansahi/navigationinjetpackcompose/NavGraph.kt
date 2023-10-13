package github.zeshansahi.navigationinjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraphSetup(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Home.rout
    ) {
        composable(
            route = Screens.Home.rout
        ) {
            HomeScreen()
        }
    }
}