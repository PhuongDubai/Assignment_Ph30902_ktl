package com.example.assignment_ph30902_ktl

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}

@Composable
fun HomeScreen() {
    val images = listOf(
        R.drawable.group1, R.drawable.group2,
        R.drawable.group3, R.drawable.group4, R.drawable.group5, R.drawable.group5,
    )
    val items = listOf(
        R.drawable.sanpham1,
        R.drawable.sanpham2,
        R.drawable.sanpham3,
        R.drawable.sanpham4,
        R.drawable.sanpham1,
        R.drawable.sanpham2,
        R.drawable.sanpham3,
        R.drawable.sanpham4,
    )

    Scaffold(
        bottomBar = {
            BottomNavigationBar()
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(paddingValues)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp, start = 16.dp, end = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.search),
                        contentDescription = "tìm kiếm",
                        modifier = Modifier
                            .width(24.dp)
                            .height(24.dp)
                    )
                    Column {
                        Text(
                            text = "Make home",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.W400,
                            color = Color(0xFF909090),
                            modifier = Modifier.padding(end = 5.dp)
                        )
                        Text(
                            text = "BEAUTIFUL",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.W700
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.bi_cart2),
                        contentDescription = "tìm kiếm",
                        modifier = Modifier
                            .width(24.dp)
                            .height(24.dp)
                    )
                }
                iconList(images)
                itemList(items)
            }
        }
    }
}

@Composable
fun iconList(imageList: List<Int>) {
    val scrollState = rememberScrollState()
    Row(
        modifier = Modifier
            .horizontalScroll(scrollState)
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        imageList.forEach { image ->
            Image(
                painter = painterResource(id = image),
                contentDescription = "Image Description",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .padding(start = 10.dp, end = 20.dp)
                    .size(44.dp)
                    .clip(RoundedCornerShape(12.dp)),
            )
        }
    }
}

@Composable
fun itemList(imageList: List<Int>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // Chia thành 2 cột
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        items(imageList.size) { index ->
            Image(
                painter = painterResource(id = imageList[index]),
                contentDescription = "Image Description",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize()
                    .clip(RoundedCornerShape(12.dp))
            )
        }
    }
}

@Composable
fun BottomNavigationBar() {
    NavigationBar(
        containerColor = Color.White,
        contentColor = Color.White,
    ) {
        NavigationBarItem(
            icon = { Icon(painter = painterResource(id = R.drawable.iconhome), contentDescription = null ,modifier = Modifier.size(18.dp)) },
            selected = true,
            onClick = {}

        )
        NavigationBarItem(
            icon = { Icon(painter = painterResource(id = R.drawable.iconflag), contentDescription = null ,modifier = Modifier.size(18.dp)) },
            selected = false,
            onClick = {}

        )
        NavigationBarItem(
            icon = { Icon(painter = painterResource(id = R.drawable.iconchuong), contentDescription = null,modifier = Modifier.size(18.dp)) },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(painter = painterResource(id = R.drawable.iconinfor), contentDescription = null,modifier = Modifier.size(18.dp)) },
            selected = false,
            onClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

@Preview(showBackground = true)
@Composable
fun PreviewHorizontalImageList() {
    itemList(
        listOf(
            R.drawable.sanpham1,
            R.drawable.sanpham2,
            R.drawable.sanpham3,
            R.drawable.sanpham4,
        )
    )
}
