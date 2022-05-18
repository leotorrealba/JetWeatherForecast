package com.leotorrealba.jetweatherforecast.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.leotorrealba.jetweatherforecast.screens.WeatherSplashScreen

@Composable
fun WeatherNavigation() {
    val navContoller = rememberNavController()
    NavHost(navController = navContoller, startDestination = WeatherScreens.SplashScreen.name) {
        composable(WeatherScreens.SplashScreen.name){
            WeatherSplashScreen(navContoller)
        }
    }
}