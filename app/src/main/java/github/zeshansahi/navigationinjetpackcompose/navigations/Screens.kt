package github.zeshansahi.navigationinjetpackcompose.navigations

const val DETAIL_ARGUMENT_ID = "id"
const val DETAIL_ARGUMENT_NAME = "name"

const val ROOT_GRAPH_ROUTE = "root"
const val AUTH_GRAPH_ROUTE = "auth"
const val HOME_GRAPH_ROUTE = "home"

sealed class Screens(val rout: String) {
    object Home : Screens("home_screen")
    object Detail : Screens("detail_screen?id={$DETAIL_ARGUMENT_ID}&name={$DETAIL_ARGUMENT_NAME}") {
        fun passArguments(id: Int, name: String): String {
            return "detail_screen?id=$id&name=$name"
        }
    }

    object Longin : Screens("login_screen")
    object Signup : Screens("Signup_screen")
}