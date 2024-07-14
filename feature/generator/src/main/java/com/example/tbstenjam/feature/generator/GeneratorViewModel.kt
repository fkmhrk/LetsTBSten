package com.example.tbstenjam.feature.generator

import androidx.lifecycle.ViewModel
import com.example.tbstenjam.core.data.tbsten.TBSTenRepository
import com.example.tbstenjam.core.model.TBSTenText
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class GeneratorViewModel @Inject constructor(
    private val repository: TBSTenRepository,
) : ViewModel() {
    sealed interface UiState {
        data class Idle(val text: TBSTenText): UiState
    }

    private val _uiState = MutableStateFlow<UiState>(UiState.Idle(repository.generate()))
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    fun generate() {
        _uiState.value = UiState.Idle(repository.generate())
    }
}