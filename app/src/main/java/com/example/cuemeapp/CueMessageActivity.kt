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

class CueMessageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CueMeAppTheme {
                CueMessageScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CueMessageScreen() {
    var message by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDCCEF9)) // light lavender
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(60.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFE1A6F2), RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Text(
                text = "write what you'd like to be cued with 🔔:",
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        TextField(
            value = message,
            onValueChange = { message = it },
            placeholder = { Text("Type your cue here...") },
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xFFF1EAFE),
                focusedContainerColor = Color(0xFFF1EAFE)
            )
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                // TODO: Add navigation logic here
            },
            modifier = Modifier
                .align(Alignment.End)
                .wrapContentWidth()
        ) {
            Text(text = "Next →")
        }
    }
}

