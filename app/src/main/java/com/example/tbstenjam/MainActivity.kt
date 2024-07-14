package com.example.tbstenjam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.tbstenjam.core.design.theme.TBStenJamTheme
import com.example.tbstenjam.feature.generator.GeneratorScreen
import com.example.tbstenjam.feature.generator.GeneratorViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TBStenJamTheme {
                val viewModel: GeneratorViewModel = hiltViewModel()
                GeneratorScreen(viewModel)
            }
        }
    }
}

