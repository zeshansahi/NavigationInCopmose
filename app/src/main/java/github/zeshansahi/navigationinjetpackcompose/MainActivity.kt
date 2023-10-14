package github.zeshansahi.navigationinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import github.zeshansahi.navigationinjetpackcompose.navigations.nav_graph.NavGraphSetup
import github.zeshansahi.navigationinjetpackcompose.ui.theme.NavigationInJetpackComposeTheme

class MainActivity : ComponentActivity() {
    lateinit var navController:NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationInJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                navController= rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                NavGraphSetup(navController = navController)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavigationInJetpackComposeTheme {
        Greeting("Android")
    }
}