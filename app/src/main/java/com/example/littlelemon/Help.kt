package com.example.littlelemon

import android.content.Context
import android.media.Image
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Help(context: Context = LocalContext.current, navController : NavHostController) {
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

        Spacer(modifier = Modifier.height(75.dp))

        Text(text = stringResource(id = R.string.add),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textDecoration = TextDecoration.Underline,
                shadow = Shadow(
                    color = Color.Black, blurRadius = 2f
                )
            )
        )

        Text(text = stringResource(id = R.string.address),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 30.dp),
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.Black,
                fontStyle = FontStyle.Italic

            )
        )

        Spacer(modifier = Modifier.height(75.dp))

        Text(text = stringResource(id = R.string.con),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textDecoration = TextDecoration.Underline,
                shadow = Shadow(
                    color = Color.Black, blurRadius = 2f
                )
            )
        )

        Row() {
            Column(modifier = Modifier
                .padding(top = 30.dp, start = 100.dp)
                .fillMaxWidth(.3f)) {
                Icon(imageVector = Icons.Default.Phone,
                    contentDescription = "phone",
                modifier = Modifier.padding(bottom = 40.dp))
                Icon(imageVector = Icons.Default.Phone,
                    contentDescription = "phone")
            }
            Column(modifier = Modifier.padding(top = 30.dp)) {
                Text(text = stringResource(id = R.string.ph1),
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier.padding(bottom = 45.dp))
                Text(text = stringResource(id = R.string.ph2),
                    fontFamily = FontFamily.Monospace)
            }
        }
    }
}

@Preview
@Composable
fun HelpPreview() {
    val context = LocalContext.current
    val navController = rememberNavController()
    Help(context, navController)
}