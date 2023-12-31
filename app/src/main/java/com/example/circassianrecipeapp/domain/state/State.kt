package com.example.circassianrecipeapp.domain.state

import com.example.circassianrecipeapp.data.database.entity.Recipe

data class State(
    val isLoading: Boolean = false,
    val recipes: List<Recipe> = emptyList(),
    val error: String? = null,
) : UiState

sealed class Effect : UiEffect {
    data object ShowToast : Effect()

}