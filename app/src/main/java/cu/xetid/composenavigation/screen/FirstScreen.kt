package cu.xetid.composenavigation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import cu.xetid.composenavigation.navigation.AppScreen

@Composable
fun FirstScreen(navController: NavHostController, modifier: Modifier) {
    BodyContent(navController, modifier)
}

@Composable
fun BodyContent(navController: NavHostController, modifier: Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hola")
        Button(onClick = {
            navController.navigate(AppScreen.SecondScreen.createRoute("ALAINNN"))
        }) {
            Text("Navega")
        }
    }
}
