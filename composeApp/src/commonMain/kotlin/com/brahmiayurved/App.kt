package com.brahmiayurved

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.brahmiayurved.myiconpack.IcContact
import com.brahmiayurved.myiconpack.IcHome
import com.brahmiayurved.myiconpack.IcLibrary
import com.brahmiayurved.myiconpack.MyIconPack
import com.brahmiayurved.presentation.HomeScreen
import com.brahmiayurved.presentation.ArticlesScreen
import com.brahmiayurved.presentation.ContactScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

// Screen types for navigation
enum class AppScreen {
    Home, Articles, Contact
}


@Composable
@Preview
fun App() {
    MaterialTheme {
        // State to track the currently selected screen
        var selectedScreen by remember { mutableStateOf(AppScreen.Home) }

        Scaffold(
            bottomBar = {
                BottomBar(
                    selectedScreen = selectedScreen,
                    onScreenSelected = { screen -> selectedScreen = screen }
                )
            }
        ) { innerPadding ->
            Box(
                Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ){
                // Conditionally render screens based on selection
                when (selectedScreen) {
                    AppScreen.Home -> HomeScreen()
                    AppScreen.Articles -> ArticlesScreen()
                    AppScreen.Contact -> ContactScreen()
                }
            }
        }
    }
}

@Composable
fun BottomBar(
    selectedScreen: AppScreen,
    onScreenSelected: (AppScreen) -> Unit
) {
    Row(
        Modifier
            .fillMaxWidth()
            .background(brush = Brush.verticalGradient(
                colors = listOf(
                    COLOR_PRIMARY,           // 0xFF4FA941
                    Color(0xFF3D8B36)       // Darker green
                )), shape = RectangleShape),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Button(
            onClick = {
                onScreenSelected(AppScreen.Home)
            }, colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent, // Background color
                contentColor = if (selectedScreen == AppScreen.Home) ORANGE else Color.White // Color for text/icon
            )
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = MyIconPack.IcHome, contentDescription = "Home",
                    Modifier.size(32.dp)
                )
                Spacer(Modifier.size(8.dp))
                Text("Home")
            }

        }
        Button(
            onClick = {
                onScreenSelected(AppScreen.Articles)
            }, colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent, // Background color
                contentColor = if (selectedScreen == AppScreen.Articles) ORANGE else Color.White // Color for text/icon
            )
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Icon(
                    imageVector = MyIconPack.IcLibrary, contentDescription = "Articles",
                    Modifier.size(32.dp)
                )
                Spacer(Modifier.size(8.dp))
                Text("Articles")
            }

        }

        Button(
            onClick = {
                onScreenSelected(AppScreen.Contact)
            }, colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent, // Background color
                contentColor = if (selectedScreen == AppScreen.Contact) ORANGE else Color.White // Color for text/icon
            )
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Icon(
                    imageVector = MyIconPack.IcContact, contentDescription = "Contact",
                    Modifier.size(32.dp)
                )
                Spacer(Modifier.size(8.dp))
                Text("Contact")
            }

        }
    }
}
