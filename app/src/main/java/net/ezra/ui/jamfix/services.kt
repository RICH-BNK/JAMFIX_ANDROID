package net.ezra.ui.jamfix

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import net.ezra.R


@Composable
fun ServiceScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF20232A))
            .padding(16.dp)

    ) {
        TopBar()
//        SearchBar()
        ServiceSection()
        ChooseServiceSection()
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "JAMFIX",
            color = Color.White,
            style = MaterialTheme.typography.h5
        )
//        Icon(
//            painter = painterResource(id = R.drawable.logojam),
//            contentDescription = "Menu",
//
//
//        )
    }
}

//@Composable
//fun SearchBar() {
//    val searchText = remember { mutableStateOf("") }
//
//    BasicTextField(
//        value = searchText.value,
//        onValueChange = { searchText.value = it },
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 16.dp)
//            .background(Color.White, RoundedCornerShape(15.dp))
//            .padding(16.dp),
//        textStyle = TextStyle(fontSize = 18.sp, color = Color.Black),
//        singleLine = true
//    )
//}

@Composable
fun ServiceSection() {
    LazyColumn {
        item {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
    ) {

        LazyRow {
            item {
                Card(
                    modifier = Modifier
                        .width(300.dp)
                        .padding(20.dp)
                        .fillMaxWidth()
                        .background(Color.White)
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.oilchange),
                            contentDescription = "oil change",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(300.dp)
                                .height(200.dp)
                                .fillMaxWidth()
                                .size(100.dp)
                        )

                    }

                }
                Spacer(modifier = Modifier.width(16.dp))
                Card(
                    modifier = Modifier
                        .width(300.dp)
                        .padding(20.dp)
                        .fillMaxWidth()
                        .background(Color.White)
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.engine_diagnostics),
                            contentDescription = "ergine diagnostics",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(300.dp)
                                .height(200.dp)
                                .fillMaxWidth()
                                .size(100.dp)
                        )

                    }

                }
                Spacer(modifier = Modifier.width(16.dp))
                Card(
                    modifier = Modifier
                        .width(300.dp)
                        .padding(20.dp)
                        .fillMaxWidth()
                        .background(Color.White)
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.car_brake),
                            contentDescription = "car brake fix ",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(300.dp)
                                .height(200.dp)
                                .fillMaxWidth()
                                .size(100.dp)
                        )

                    }

                }
                Spacer(modifier = Modifier.width(16.dp))
                Card(
                    modifier = Modifier
                        .width(300.dp)
                        .padding(20.dp)
                        .fillMaxWidth()
                        .background(Color.White)
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.carwas),
                            contentDescription = " car wash ",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(300.dp)
                                .height(200.dp)
                                .fillMaxWidth()
                                .size(100.dp)
                        )

                    }

                }
                Spacer(modifier = Modifier.width(16.dp))
                Card(
                    modifier = Modifier
                        .width(300.dp)
                        .padding(20.dp)
                        .fillMaxWidth()
                        .background(Color.White)
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.air_conditioning),
                            contentDescription = "air condition",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(300.dp)
                                .height(200.dp)
                                .fillMaxWidth()
                                .size(100.dp)
                        )

                    }

                }
                Spacer(modifier = Modifier.width(16.dp))
                Card(
                        modifier = Modifier
                            .width(300.dp)
                            .padding(20.dp)
                            .fillMaxWidth()
                            .background(Color.White)
                        ) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.wheel_tyre),
                            contentDescription = "wheel tyre",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(300.dp)
                                .height(200.dp)
                                .fillMaxWidth()
                                .size(100.dp)
                        )

                    }

                }
            }
            }








            Spacer(modifier = Modifier.height(16.dp))

        }
    }


@Composable
fun ServiceItem(icon: Int, label: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = label,
            tint = Color.Black,
            modifier = Modifier.size(48.dp)
        )
        Text(text = label, color = Color.White)
    }
}
}
}

@Composable
fun ChooseServiceSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF333642))
            .clip(RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Text(text = "Choose car service.", color = Color.White, style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.height(16.dp))
        ChooseServiceItem("Basic Service", ".")
        ChooseServiceItem("Transmission", ".")
        ChooseServiceItem("Engine Service", "")
        ChooseServiceItem("Electrical Work", "")
    }
}

@Composable
fun ChooseServiceItem(title: String, description: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Text(text = title, color = Color.Yellow, style = MaterialTheme.typography.body1)
        Text(text = description, color = Color.White.copy(alpha = 0.7f), style = MaterialTheme.typography.body2)
        Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
    }
}
