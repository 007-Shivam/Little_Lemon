package com.example.littlelemon.dishes

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.LogIn
import com.example.littlelemon.R

@Composable
fun ChoBh(context: Context = LocalContext.current, navController: NavHostController) {
    Column(modifier = Modifier
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

        LazyColumn (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            item {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        text = stringResource(id = R.string.chobh),
                        style = TextStyle(
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Blue,
                            textDecoration = TextDecoration.Underline,
                            shadow = Shadow(color = Color.Blue, blurRadius = 4f)
                        ),
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.choola_bhatura),
                    contentDescription = "plkpan",
                    modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
                    alignment = Alignment.Center
                )
            }

            item {
                Spacer(modifier = Modifier.padding(top = 20.dp))
            }

            item {
                Text(
                    text = stringResource(id = R.string.description),
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Red,
                        textDecoration = TextDecoration.Underline
                    ),
                    modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
                )
            }

            item {
                Text(
                    text = stringResource(id = R.string.chobh_des),
                    style = TextStyle(fontSize = 15.sp, color = Color.Black),
                    modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
                )
            }

            item {
                Text(
                    text = stringResource(id = R.string.ing),
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Red,
                        textDecoration = TextDecoration.Underline
                    ),
                    modifier = Modifier.padding(10.dp)
                )
            }

            item {
                Text(
                    text = stringResource(id = R.string.chobh_ing),
                    style = TextStyle(fontSize = 15.sp, color = Color.Black),
                    modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun ChoBhPreview() {
    val context = LocalContext.current
    val navController = rememberNavController()
    ChoBh(context, navController)
}