package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController


@Composable
fun FormulaZeroApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("races") { UpcomingRacesScreen(navController) }
    }
}
