package com.example.tbstenjam.core.design.component

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun TOutlinedButton(
    text: String,
    onClick: () -> Unit,
) {
    OutlinedButton(onClick = onClick) {
        Text(text)
    }
}