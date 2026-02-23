package com.example.profilescreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.profilescreen.ui.theme.ProfileScreenTheme
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileScreenTheme {
                ProfileScreen()
            }
        }
    }
}

val HeaderBackground = Color(0xFFE8B4A0)
val AvatarColor = Color(0xFFC17B5E)
val CardBackground = Color(0xFFFDF6F0)
val AccentColor = Color(0xFFB5624A)
val SubtleBackground = Color(0xFFF5E6DE)

@Composable
fun ProfileScreen() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFDF6F0))
    ) {

        Column(modifier = Modifier.fillMaxWidth()) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .background(HeaderBackground)
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
                    .offset(y = (-8).dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                colors = CardDefaults.cardColors(containerColor = CardBackground)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 52.dp, bottom = 20.dp, start = 20.dp, end = 20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Varada",
                        style = MaterialTheme.typography.titleLarge,
                        color = AccentColor
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = "Software Engineer",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color(0xFF8A6355)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = { },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = AccentColor)
                    ) {
                        Text("Edit Profile", color = Color.White)
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    HorizontalDivider(color = Color(0xFFE8D5CC))

                    Spacer(modifier = Modifier.height(12.dp))
                    
                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(5f),
                        color = SubtleBackground,
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text(
                                text = "Boston, MA",
                                style = MaterialTheme.typography.bodySmall,
                                color = Color(0xFF8A6355)
                            )
                        }
                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .size(90.dp)
                .align(Alignment.TopCenter)
                .offset(y = 115.dp)
                .clip(CircleShape)
                .background(AvatarColor)
        )
    }
}


