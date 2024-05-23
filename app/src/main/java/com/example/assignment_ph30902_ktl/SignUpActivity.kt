package com.example.assignment_ph30902_ktl

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.jar.Attributes.Name

class SignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GetLayoutSignUp()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GetLayoutSignUp() {
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 40.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.line),
                    contentDescription = "Đường kẻ",
                    modifier = Modifier
                        .width(120.dp)
                        .height(70.dp)
                        .padding(end = 16.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.line),
                    contentDescription = "Đường kẻ",
                    modifier = Modifier
                        .width(120.dp)
                        .height(70.dp)
                        .padding(start = 16.dp)
                )
            }

            Text(
                text = "WELCOME ",
                fontSize = 30.sp,
                modifier = Modifier.padding(top = 20.dp, bottom = 50.dp),
                color = Color.Black,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Name")
            TextField(
                value = name,
                onValueChange = { name = it },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent // Thay đổi màu nền ở đây
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Email")
            TextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent // Thay đổi màu nền ở đây
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Password")
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent // Thay đổi màu nền ở đây
                )
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Confirm Password")
            TextField(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent // Thay đổi màu nền ở đây
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    // Xử lý đăng nhập
                },
                modifier = Modifier
                    .padding(vertical = 20.dp)
                    .fillMaxWidth()
                    .width(285.dp) // Đặt chiều rộng của nút
                    .height(50.dp), // Đặt chiều cao của nút
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF242424))
            ) {
                Text(text = "SIGN UP", fontSize = 18.sp)
            }
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Row {
                    Text(
                        text = "Already have account?",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W600,
                        color = Color(0xFF909090),
                        modifier = Modifier
                            .padding(end = 5.dp)
                        )
                    Text(
                        text = "SIGN IN",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W700
                    )
                }
            }
        }

    }
}