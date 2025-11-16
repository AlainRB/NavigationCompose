package cu.xetid.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import cu.xetid.composenavigation.screen.FirstScreen
import cu.xetid.composenavigation.screen.SecondScreen

@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier) {
    NavHost(navController = navController, startDestination = AppScreen.FirstScreen.route, modifier = modifier) {
        composable(route = AppScreen.FirstScreen.route) {
            FirstScreen(navController, modifier)
        }
        composable(
            route = AppScreen.SecondScreen.route,
            arguments = listOf(navArgument("name") { type = NavType.StringType })
        ) {
            val name = it.arguments?.getString("name")
            SecondScreen(navController, modifier, name)
        }
    }
}