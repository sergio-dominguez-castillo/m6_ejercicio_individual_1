package cl.bootcamp.ejercicioindividual1.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import cl.bootcamp.ejercicioindividual1.viewModel.ContactsViewModel

@Composable
fun NavManager(
    modifier: Modifier,
    contactsViewModel: ContactsViewModel

) {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "Home") {
        composable("Home") {
            //   HomeView(navController, contacts ViewModel)
        }
    }
}