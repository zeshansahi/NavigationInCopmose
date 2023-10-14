package github.zeshansahi.navigationinjetpackcompose.viewScreens

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import github.zeshansahi.navigationinjetpackcompose.navigations.Screens

private const val TAG = "DetailScreen"

@Composable
fun DetailScreen(navHostController: NavHostController) {
    Log.e(TAG, "DetailScreen: ")
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.clickable {
                navHostController.navigate(Screens.Home.rout) {
                    popUpTo(Screens.Home.rout) {
                        inclusive = true
                    }
                }
            },
            text = "DetailScreen",
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            color = MaterialTheme.colorScheme.primary
        )
    }
}

@Composable
@Preview(showBackground = true)
fun DetailScreenP() {
    DetailScreen(rememberNavController())
}