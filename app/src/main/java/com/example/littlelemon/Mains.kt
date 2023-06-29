package com.example.littlelemon

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.data.Categories
import com.example.littlelemon.data.dishes
import com.example.littlelemon.data.mn
import com.example.littlelemon.data.st

@Composable
fun Mains(context: Context = LocalContext.current, navController : NavHostController) {
    val categoryOnClickActions = listOf(
        { navController.navigate(HomeScreen.route) },
        { navController.navigate(Starters.route) },
        { navController.navigate(Mains.route) },
        { navController.navigate(Deserts.route) },
        { navController.navigate(Help.route) }
    )
    val dishOnClickActions = listOf(
        { navController.navigate(ButCh.route) },
        { navController.navigate(ChoBh.route) },
        { navController.navigate(PavBh.route) },
        { navController.navigate(PlkPan.route) },

    )

    Column(
        Modifier
            .background(color = Color(210, 248, 210))
            .fillMaxSize()) {
        Box() {
            Image(painter = painterResource(id = R.drawable.bg), contentDescription = null)
            Button(onClick = { navController.navigate(LogIn.route)
                Toast.makeText(context,
                    "Logged out successfully",
                    Toast.LENGTH_LONG
                ).show()},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                modifier = Modifier.align(Alignment.TopEnd)
                    .padding(end = 8.dp)) {
                Text(text = stringResource(id = R.string.logout),
                    color = Color.Black)
            }
            Text(text = "Little\nLemon",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontFamily = FontFamily.Serif,
                modifier = Modifier.align(Alignment.Center),
                fontSize = 50.sp
            )
        }

        LazyRow{
            itemsIndexed(Categories) { index, category ->
                MenuCategory(category, onClick =  categoryOnClickActions[index])

            }
        }
        Divider(
            modifier = Modifier.padding(5.dp),
            color = Color.Gray,
            thickness = 1.dp
        )

        LazyColumn{
            itemsIndexed(mn) { index, Dish ->
                MenuDish(Dish, onClick =  dishOnClickActions[index])
            }
        }
    }
}

@Preview
@Composable
fun MainsPreview() {
    val context = LocalContext.current
    val navController = rememberNavController()
    Mains(context, navController)
}