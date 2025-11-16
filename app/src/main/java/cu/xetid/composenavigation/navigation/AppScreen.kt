package cu.xetid.composenavigation.navigation

sealed class AppScreen(val route: String) {
    object FirstScreen : AppScreen("first_screen")
    object SecondScreen : AppScreen("second_screen/{name}") {
        fun createRoute(name: String) = "second_screen/$name"
    }
}