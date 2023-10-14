package github.zeshansahi.navigationinjetpackcompose.viewScreens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import github.zeshansahi.navigationinjetpackcompose.navigations.Screens

@Composable
fun HomeScreen(navHostController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column() {
            Text(
                text = "Home scree",
                fontSize = MaterialTheme.typography.headlineLarge.fontSize,
                color = MaterialTheme.colorScheme.inversePrimary
            )
            Button(onClick = {
                navHostController.navigate(
                    route = Screens.Detail.passArguments(
                        1,
                        "zeshan-sahi"
                    )
                )
            }) {
                Text(text = "Go to Detail screen")
            }
            Button(onClick = {
                navHostController.navigate(
                    route = Screens.Longin.rout
                )
            }) {
                Text(text = "Go to login screen")
            }
        }

    }
}

@Composable
@Preview(showBackground = true)
fun HomeSp() {
    HomeScreen(rememberNavController())
}