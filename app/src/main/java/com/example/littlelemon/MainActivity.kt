package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.dishes.ButCh
import com.example.littlelemon.dishes.ChoBh
import com.example.littlelemon.dishes.GulJa
import com.example.littlelemon.dishes.Jal
import com.example.littlelemon.dishes.Pan65
import com.example.littlelemon.dishes.PavBh
import com.example.littlelemon.dishes.PlkPan
import com.example.littlelemon.dishes.Tand

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNavigation()
        }
    }
}

@Composable
fun MyNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = HomeScreen.route){
        composable(LogIn.route) {
            LogIn(navController = navController)
        }
        composable(SignUp.route) {
            SignUp(navController = navController)
        }
        composable(HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(Starters.route) {
            Starters(navController = navController)
        }
        composable(Mains.route) {
            Mains(navController = navController)
        }
        composable(Deserts.route) {
            Deserts(navController = navController)
        }
        composable(Help.route) {
            Help(navController = navController)
        }
        composable(Pan65.route) {
            Pan65(navController = navController)
        }
        composable(Tand.route) {
            Tand(navController = navController)
        }
        composable(ButCh.route) {
            ButCh(navController = navController)
        }
        composable(ChoBh.route) {
            ChoBh(navController = navController)
        }
        composable(PavBh.route) {
            PavBh(navController = navController)
        }
        composable(PlkPan.route) {
            PlkPan(navController = navController)
        }
        composable(GulJa.route) {
            GulJa(navController = navController)
        }
        composable(Jal.route) {
            Jal(navController = navController)
        }
    }
}
