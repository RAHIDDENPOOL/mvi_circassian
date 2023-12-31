package com.example.circassianrecipeapp.domain.state

interface UiEvent {
    fun onCarouselsCardClicked() = Unit
    fun onRecipesCardClicked() = Unit
}