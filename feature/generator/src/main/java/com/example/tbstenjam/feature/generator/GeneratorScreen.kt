package com.example.tbstenjam.feature.generator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tbstenjam.core.model.TBSTenText

@Composable
fun GeneratorScreen(
    viewModel: GeneratorViewModel,
) {
    val uiState by viewModel.uiState.collectAsState()

    GeneratorScreen(
        uiState = uiState,
        generate = { viewModel.generate() },
    )
}

@Composable
private fun GeneratorScreen(
    uiState: GeneratorViewModel.UiState,
    generate: () -> Unit,
) {
    when (uiState) {
        is GeneratorViewModel.UiState.Idle -> {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(uiState.text.value, style = MaterialTheme.typography.headlineMedium)
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedButton(onClick = generate) {
                    Text("てべすてんを当てろ！")
                }
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    GeneratorScreen(
        uiState = GeneratorViewModel.UiState.Idle(TBSTenText("てべすてん")),
        generate = {},
    )
}