package net.ezra.ui.jamfix


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.ezra.R



@Composable
fun ServiceProviderScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
        HeaderImageSection()
        ProviderDetailsSection()
//        BottomNavigationBar()
    }
}

@Composable
fun HeaderImageSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.mechanic), // replace with your image resource
            contentDescription = "Worker Image",
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Composable
fun ProviderDetailsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
            .background(Color.White)
            .padding(16.dp)
    ) {
        Text(
            text = "Alex",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A237E)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "4.5", fontSize = 20.sp, color = Color(0xFF1A237E))
            Spacer(modifier = Modifier.width(4.dp))
            for (i in 1..5) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_star), // replace with your star icon resource
                    contentDescription = "Rating Star",
                    tint = if (i <= 4) Color(0xFFFFC107) else Color(0xFFB0BEC5),
                    modifier = Modifier.size(20.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            JobRoleChip("Electrician")
            JobRoleChip("Welder")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Rate $25/hr",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF1A237E)
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = { /* Handle click */ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF1A237E))
        ) {
            Text(text = "Book Now", fontSize = 18.sp, color = Color.White)
        }
    }
}

@Composable
fun JobRoleChip(role: String) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFFBBDEFB))
            .padding(vertical = 8.dp, horizontal = 16.dp)
    ) {
        Text(text = role, fontSize = 16.sp, color = Color(0xFF1A237E))
    }
}

