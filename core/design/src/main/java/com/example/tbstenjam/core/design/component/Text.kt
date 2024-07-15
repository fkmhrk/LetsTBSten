package com.example.tbstenjam.core.design.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun TText(text: String) {
    Text(text, style = MaterialTheme.typography.headlineMedium)
}