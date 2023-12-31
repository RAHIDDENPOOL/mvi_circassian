package com.example.circassianrecipeapp.di

import android.app.Application
import com.example.circassianrecipeapp.data.repository.RecipeRepository
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltAndroidApp
class CircassianApp : Application() {
    @Inject
    lateinit var recipeRepository: RecipeRepository

    override fun onCreate() {
        super.onCreate()
        CoroutineScope(Dispatchers.Default).launch {
            recipeRepository.initializeDataBase()
        }
    }
}
