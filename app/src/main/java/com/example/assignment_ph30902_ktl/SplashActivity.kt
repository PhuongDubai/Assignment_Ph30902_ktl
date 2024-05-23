package com.example.assignment_ph30902_ktl

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreen()
        }
    }
}

@Composable
fun SplashScreen() {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxWidth()
            // Bạn có thể thay đổi màu nền nếu cần
    ) {
        Image(
            painter = painterResource(id = R.drawable.boarding),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds // Đảm bảo hình ảnh không bị căn chỉnh hoặc thu phóng
        )

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(500.dp))
            Button(
                onClick = {
                    // Hành động khi nhấn nút
                    context.startActivity(Intent(context, LoginActivity::class.java))
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF242424), // Đặt màu bằng mã hex
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(5.dp), // Đặt hình dạng của nút thành hình chữ nhật
                modifier = Modifier
                    .width(159.dp) // Đặt chiều rộng của nút
                    .height(54.dp) // Đặt chiều cao của nút
            ) {
                Text("Get Started")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}
