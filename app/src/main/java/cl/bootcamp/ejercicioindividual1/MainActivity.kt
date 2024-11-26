package cl.bootcamp.ejercicioindividual1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import cl.bootcamp.ejercicioindividual1.navigation.NavManager
import cl.bootcamp.ejercicioindividual1.ui.theme.Ejercicioindividual1Theme
import cl.bootcamp.ejercicioindividual1.viewModel.ContactsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val contactsViewModel: ContactsViewModel by viewModels()
        setContent {
            Ejercicioindividual1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavManager(
                        modifier = Modifier.padding(innerPadding),
                        contactsViewModel
                    )
                }
            }
        }
    }
}

