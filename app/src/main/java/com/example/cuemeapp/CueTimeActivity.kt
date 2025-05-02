package com.example.cuemeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cuemeapp.ui.theme.CueMeAppTheme

class CueTimeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CueMeAppTheme {
                CueTimeScreen()
            }
        }
    }
}

@Composable
fun CueTimeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDCCEF9))
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        // Placeholder for cue message + date (will be populated dynamically later)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFEADDF7), RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Text(
                text = "",
                fontSize = 16.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "",
                fontSize = 14.sp,
                color = Color.DarkGray
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Title for Time Picker section
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFE1A6F2), RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Text(
                text = "Pick Up Your Cue Time 🔔",
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Empty TimePicker placeholder (logic later)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
                .background(Color.White, RoundedCornerShape(8.dp))
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Next Button
        Button(
            onClick = { /* logic comes later */ },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "Next →")
        }
    }
}
