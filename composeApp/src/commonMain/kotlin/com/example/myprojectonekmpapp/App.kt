package com.example.myprojectonekmpapp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable
fun App() {
    MaterialTheme {

        var showInfo by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text("Halo, Andini Rahma Kemala!")
            Text("NIM: 123140067")

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { showInfo = !showInfo }) {
                Text("Klik Saya")
            }

            AnimatedVisibility(showInfo) {
                Text("Platform: ${getPlatform().name}")
            }
        }
    }
}
