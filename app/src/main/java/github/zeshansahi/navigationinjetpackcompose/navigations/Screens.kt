package github.zeshansahi.navigationinjetpackcompose.navigations

const val DETAIL_ARGUMENT_ID = "id"
const val DETAIL_ARGUMENT_NAME = "name"

sealed class Screens(val rout: String) {
    object Home : Screens("home_screen")
    object Detail : Screens("detail_screen?id={$DETAIL_ARGUMENT_ID}&name={$DETAIL_ARGUMENT_NAME}") {
        fun passArguments(id: Int, name: String): String {
            return "detail_screen?id=$id&name=$name"
        }
    }
}