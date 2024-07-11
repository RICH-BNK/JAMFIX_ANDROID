package net.ezra.ui.home






import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text2.input.rememberTextFieldState
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigation
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Card
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_ADD_PRODUCT
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_DASHBOARD
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_HOMEE
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_SEARCH
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_VIEW_PROD
import net.ezra.navigation.ROUTE_VIEW_STUDENTS


data class Screen(val title: String, val icon: Int)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    var text by remember{
        mutableStateOf(TextFieldValue(""))
    }
    var naughty by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var isDrawerOpen by remember { mutableStateOf(false) }

    val callLauncher: ManagedActivityResultLauncher<Intent, ActivityResult> =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) { _ ->

        }



    Scaffold(
//        topBar = {
//            CenterAlignedTopAppBar(
//                title = {
//                    Text(text ="JamFIX",
//                        fontSize = 30.sp,
//                        color = Color.Black,
//                        fontFamily = FontFamily.Monospace,
//                        fontStyle = FontStyle.Normal,
//                        fontWeight = FontWeight.W900
//                    )
//
//
//                },
//                navigationIcon = @Composable {
//                    if (!isDrawerOpen) {
//                        IconButton(onClick = { isDrawerOpen = true }) {
//                            Icon(
//                                Icons.Default.Menu,
//                                contentDescription = "Menu",
//                                tint = Color(0xff101420)
//                                )
//                        }
//                    }
//                },
//
//                actions = {
//                    IconButton(onClick = {
//                        navController.navigate(ROUTE_LOGIN) {
//                            popUpTo(ROUTE_HOME) { inclusive = true }
//                        }
//
//                    })
//
//                    {
//                        Icon(
//                            imageVector = Icons.Filled.AccountCircle,
//                            contentDescription = null,
//                            tint = Color.Black
//                        )
//                    }
//                },
//
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = Color(0xffFF0000),
//                    titleContentColor = Color.Black,
//
//                )
//
//            )
//
//        }
//
//        ,



        content = @Composable {
            //this is where i will put my home content





            LazyColumn {

            item {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)

                )
                {
                  Spacer(modifier = Modifier.height(16.dp))
                    Image(painter = painterResource(id = R.drawable.mechanic),
                        contentDescription = "mechimage",
                        modifier=Modifier
                            .fillMaxSize()
                            .width(700.dp)
                            .height(500.dp)
                    )
                   Spacer(modifier = Modifier.height(16.dp))
                    Text(text = "Experience exemplary servicers with amfix",
                        style=MaterialTheme.typography.headlineLarge,
                        modifier = Modifier
                            .padding(bottom = 8.dp)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(text = "Experience exemplary servicers with amfix",
                        style=MaterialTheme.typography.headlineSmall,
                        modifier = Modifier
                            .padding(bottom = 24.dp)
                    )
                   Button(onClick = { /*TODO*/ },
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(48.dp)

                       ) {
                       Text("get started")
                   }
                   Spacer(modifier = Modifier
                       .height(16.dp)
                   )
                   TextButton(
                       onClick = { /*TODO*/ },
                       modifier = Modifier
                           .fillMaxWidth()
                       ) {
                       Text("Have already an account?Login")
                   }

                    Text(
                        text = stringResource(id = R.string.call),
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(16.dp)
                            .clickable {

                                val intent = Intent(Intent.ACTION_DIAL)
                                intent.data = Uri.parse("tel:+254727004144")

                                callLauncher.launch(intent)
                            }
                    )
                    Spacer(modifier = Modifier.height(15.dp))

                    Text(
                        modifier = Modifier

                            .clickable {
                                navController.navigate(ROUTE_LOGIN) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            },
                        text = "Login Here",
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )



                    Text(
                        modifier = Modifier
                            .clickable {
                                navController.navigate(ROUTE_ADD_PRODUCT) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            },
                        text = "Add Products",
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Text(
                        modifier = Modifier

                            .clickable {
                                navController.navigate(ROUTE_ADD_STUDENTS) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            },
                        text = "Add to cart",
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Text(
                        modifier = Modifier

                            .clickable {
                                navController.navigate(ROUTE_VIEW_PROD) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            },
                        text = "view Products",
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )



                    Spacer(modifier = Modifier.height(15.dp))

                    Text(
                        text = "You're welcome",
                        fontSize = 30.sp,
                        color = Color.White
                    )

                }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF31312D)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                LazyRow(modifier = Modifier

                    .height(150.dp)
                    .fillMaxSize()

                )

                {

                    item {
                        Card (
                            modifier = Modifier
                                .width(300.dp)
                                .padding(20.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        ){
                            Box {
                                Image(painter = painterResource(id = R.drawable.benz),
                                    contentDescription ="" ,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(200.dp)
                                        .fillMaxWidth()
                                        .size(100.dp)
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(40.dp)
                                )}}
                        Card (
                            modifier = Modifier
                                .width(300.dp)
                                .padding(20.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        ){
                            Box {
                                Image(painter = painterResource(id = R.drawable.rover),
                                    contentDescription ="" ,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(200.dp)
                                        .fillMaxWidth()
                                        .size(100.dp)
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(40.dp)
                                )}}
                        Card (
                            modifier = Modifier
                                .width(300.dp)
                                .padding(20.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        ){
                            Box {
                                Image(painter = painterResource(id = R.drawable.toyota),
                                    contentDescription ="" ,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(200.dp)
                                        .fillMaxWidth()
                                        .size(100.dp)
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(40.dp)
                                )}}
                        Card (
                            modifier = Modifier
                                .width(300.dp)
                                .padding(20.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        ){
                            Box {
                                Image(painter = painterResource(id = R.drawable.dodge),
                                    contentDescription ="" ,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(200.dp)
                                        .fillMaxWidth()
                                        .size(100.dp)
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(40.dp)
                                )}}
                        Card (
                            modifier = Modifier
                                .width(300.dp)
                                .padding(20.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        ){
                            Box {
                                Image(painter = painterResource(id = R.drawable.audi),
                                    contentDescription ="" ,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(200.dp)
                                        .fillMaxWidth()
                                        .size(100.dp)
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(40.dp)
                                )}}
                        Card (
                            modifier = Modifier
                                .width(300.dp)
                                .padding(20.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        ){
                            Box {
                                Image(painter = painterResource(id = R.drawable.lambo),
                                    contentDescription ="" ,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(200.dp)
                                        .fillMaxWidth()
                                        .size(100.dp)
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(40.dp)
                                )}}
                        Card (
                            modifier = Modifier
                                .width(300.dp)
                                .padding(20.dp)
                                .fillMaxWidth()
                                .background(Color.White)

                        ){
                            Box {
                                Image(painter = painterResource(id = R.drawable.mitsubishi),
                                    contentDescription ="" ,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(200.dp)
                                        .fillMaxWidth()
                                        .size(100.dp)
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(40.dp)
                                )}}
                        Card (
                            modifier = Modifier
                                .width(300.dp)
                                .padding(20.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        ){
                            Box {
                                Image(painter = painterResource(id = R.drawable.suzuki),
                                    contentDescription ="" ,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(200.dp)
                                        .fillMaxWidth()
                                        .size(100.dp)
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(40.dp)
                                )}}
                        Card (
                            modifier = Modifier
                                .width(300.dp)
                                .padding(20.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        ){
                            Box {
                                Image(painter = painterResource(id = R.drawable.subby),
                                    contentDescription ="" ,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(200.dp)
                                        .fillMaxWidth()
                                        .size(100.dp)
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(40.dp)
                                )}}
                        Card (
                            modifier = Modifier
                                .width(300.dp)
                                .padding(20.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        ){
                            Box {
                                Image(painter = painterResource(id = R.drawable.toyota),
                                    contentDescription ="" ,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(200.dp)
                                        .fillMaxWidth()
                                        .size(100.dp)
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(40.dp)
                                )}}
                        Card (
                            modifier = Modifier
                                .width(300.dp)
                                .padding(20.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        ){
                            Box {
                                Image(painter = painterResource(id = R.drawable.chevrolet),
                                    contentDescription ="" ,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(200.dp)
                                        .fillMaxWidth()
                                        .size(100.dp)
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(40.dp)
                                )}}
                        Card (
                            modifier = Modifier
                                .width(300.dp)
                                .padding(20.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        ){
                            Box {
                                Image(painter = painterResource(id = R.drawable.rolls),
                                    contentDescription ="" ,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(200.dp)
                                        .fillMaxWidth()
                                        .size(100.dp)
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(40.dp)
                                )}}
                        Card (
                        modifier = Modifier
                            .width(300.dp)
                            .padding(20.dp)
                            .fillMaxWidth()
                            .background(Color.White)
                    ){
                        Box {
                            Image(painter = painterResource(id = R.drawable.bmw),
                                contentDescription ="" ,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .width(300.dp)
                                    .height(200.dp)
                                    .fillMaxWidth()
                                    .size(100.dp)
                            )
                            Spacer(
                                modifier = Modifier
                                    .padding(40.dp)
                            )}}
                        Card (
                            modifier = Modifier
                                .width(300.dp)
                                .padding(20.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        ){
                            Box {
                                Image(painter = painterResource(id = R.drawable.lexus),
                                    contentDescription ="" ,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(200.dp)
                                        .height(300.dp)
                                        .fillMaxWidth()
                                        .size(100.dp)
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(40.dp)
                                )}}
                        Card (
                            modifier = Modifier
                                .width(300.dp)
                                .padding(20.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        ){

                            Box {
                                Image(
                                    painter = painterResource(id = R.drawable.porsche),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(200.dp)
                                        .fillMaxWidth()
                                )
                                Spacer(
                                    modifier = Modifier
                                        .padding(40.dp)
                                )
                            }
                        }
                    }
                }











//                Text(
//                    text = stringResource(id = R.string.developer),
//                    fontSize = 20.sp,
//                )



            }

        }}

        },





        bottomBar = { BottomBar(navController = navController) }

    )

    AnimatedDrawer(
        isOpen = isDrawerOpen,
        onClose = { isDrawerOpen = false }
    )
}

@Composable
fun AnimatedDrawer(isOpen: Boolean, onClose: () -> Unit) {
    val drawerWidth = remember { Animatable(if (isOpen) 250f else 0f) }

    LaunchedEffect(isOpen) {
        drawerWidth.animateTo(if (isOpen) 250f else 0f, animationSpec = tween(durationMillis = 300))
    }

    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .width(drawerWidth.value.dp)
            ,
        color = Color.Blue,
//        elevation = 16.dp
    ) {
        Column {
           //put the menu content at the top left part of the screen
        }
    }
}






@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(
        elevation = 10.dp,
        backgroundColor = Color(0xffFF0000)   ) {

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"", tint = Color.Black)
        },
            label = { Text(text = "Home",color =  Color.Black) }, selected = (selectedIndex.value == 0), onClick = {
                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })

        BottomNavigationItem(icon = {
            Icon( imageVector = Icons.Default.Build,"",tint = Color.Black)
        },
            label = { Text(text = "services",color =  Color.Black) }, selected = (selectedIndex.value == 1), onClick = {
                navController.navigate(ROUTE_SERVICES) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })



        BottomNavigationItem(icon = {
            Icon( imageVector = Icons.Default.ShoppingCart,"",tint = Color.Black)
        },
            label = { Text(text = "services",color =  Color.Black) }, selected = (selectedIndex.value == 1), onClick = {
                navController.navigate(ROUTE_HOMEE) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "",tint = Color.Black)
        },
            label = { Text(
                text = "Profile",
                color =  Color.Black) },
            selected = (selectedIndex.value == 2),
            onClick = {

                navController.navigate(ROUTE_DASHBOARD) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })
    }
}