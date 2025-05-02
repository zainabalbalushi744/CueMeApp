package com.example.cuemeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cuemeapp.ui.theme.CueMeAppTheme

class CueDateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CueMeAppTheme {
                CueDateScreen()
            }
        }
    }
}

@Composable
fun CueDateScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDCCEF9))
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        // Cue message + date box
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFEADDF7), RoundedCornerShape(8.dp))
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

        // Repeat toggle row
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Repeat this cue?", fontSize = 16.sp)
            Spacer(modifier = Modifier.width(12.dp))
            Switch(checked = true, onCheckedChange = { /* logic later */ })
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "Custom",
                modifier = Modifier
                    .background(Color(0xFFEEE6FA), RoundedCornerShape(16.dp))
                    .padding(horizontal = 12.dp, vertical = 4.dp),
                fontSize = 14.sp
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Title box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFE1A6F2), RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Text(
                text = "Pick Up Your Cue Date 🔔",
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Date Picker Placeholder
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