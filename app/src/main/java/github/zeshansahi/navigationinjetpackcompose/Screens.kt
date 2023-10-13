package github.zeshansahi.navigationinjetpackcompose

sealed class Screens(val rout:String) {
    object Home:Screens("home_screen")
    object Detail:Screens("detail_screen")
}