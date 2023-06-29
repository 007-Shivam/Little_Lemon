package com.example.littlelemon

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp (context: Context = LocalContext.current, navController : NavHostController) {

    var f_name by remember { mutableStateOf(TextFieldValue()) }
    var l_name by remember { mutableStateOf(TextFieldValue()) }
    var email by remember { mutableStateOf(TextFieldValue()) }
    var password by remember { mutableStateOf(TextFieldValue()) }
    var c_password by remember { mutableStateOf(TextFieldValue()) }

    Column(
        Modifier
            .background(color = Color(210, 248, 210))
            .fillMaxSize()) {
        Box() {
            Image(painter = painterResource(id = R.drawable.bg), contentDescription = null)
            Text(
                text = "Little\nLemon",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontFamily = FontFamily.Serif,
                modifier = Modifier.align(Alignment.Center),
                fontSize = 50.sp
            )
        }

        Text(text = stringResource(id = R.string.signup),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue,
                textDecoration = TextDecoration.Underline,
                shadow = Shadow(
                    color = Color.Blue, blurRadius = 9f
                )
            )
        )

        Spacer(modifier = Modifier.height(30.dp))

        Row(Modifier.padding(start = 10.dp, end = 10.dp)
        ){
            Text(text = stringResource(id = R.string.f_name),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterVertically),
                fontSize = 25.sp,
            )
            TextField(
                value = f_name,
                onValueChange = {
                    f_name = it
                },
                placeholder = { Text(text = "Shivam") },
                modifier = Modifier
                    .padding(top = 15.dp, start = 65.dp)
                    .border(1.dp, Color.Black)
            )
        }
        Row(Modifier.padding(start = 10.dp, end = 10.dp)) {
            Text(text = stringResource(id = R.string.l_name),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterVertically),
                fontSize = 25.sp,
            )
            TextField(
                value = l_name,
                onValueChange = {
                    l_name = it
                },
                placeholder = { Text(text = "Bhosle") },
                modifier = Modifier
                    .padding(top = 15.dp, start = 65.dp)
                    .border(1.dp, Color.Black)
            )
        }
        Row(Modifier.padding(start = 10.dp, end = 10.dp)) {
            Text(text = stringResource(id = R.string.s_email),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterVertically),
                fontSize = 25.sp,
            )
            TextField(
                value = email,
                onValueChange = {
                    email = it
                },
                placeholder = { Text(text = "abc@gmail.com") },
                modifier = Modifier
                    .padding(top = 15.dp, start = 65.dp)
                    .border(1.dp, Color.Black)
            )
        }
        Row(Modifier.padding(start = 10.dp, end = 10.dp)) {
            Text(text = stringResource(id = R.string.s_password),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterVertically),
                fontSize = 25.sp,
            )
            TextField(
                value = password,
                onValueChange = {
                    password = it
                },
                placeholder = { Text(text = "12345") },
                modifier = Modifier
                    .padding(top = 15.dp, start = 65.dp)
                    .border(1.dp, Color.Black)
            )
        }
        Row(Modifier.padding(start = 10.dp, end = 10.dp)) {
            Text(text = stringResource(id = R.string.confirm),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterVertically),
                fontSize = 25.sp,
            )
            TextField(
                value = c_password,
                onValueChange = {
                    c_password = it
                },
                placeholder = { Text(text = "12345") },
                modifier = Modifier
                    .padding(top = 15.dp, start = 65.dp)
                    .border(1.dp, Color.Black)
            )
        }

        Button(
            onClick = { if(email.text == ""
                && password.text==""
                && f_name.text==""
                && l_name.text==""
                && c_password.text==""
            ){
                Toast.makeText(context,
                    "Please fill all text-fields.",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                Toast.makeText(context,
                    "Successfully Registered",
                    Toast.LENGTH_LONG
                ).show()
                navController.navigate(LogIn.route)
            } },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
            modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(top = 20.dp)
        ) {
            Text(text = stringResource(id = R.string.signup))
        }
    }
}

@Preview
@Composable
fun SignUpPreview() {
    val context = LocalContext.current
    val navController = rememberNavController()// Obtain the context from the composition
    SignUp(context, navController)
}