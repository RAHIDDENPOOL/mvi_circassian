package com.example.circassianrecipeapp

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.circassianrecipeapp.data.dao.RecipeDao
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var recipeDao: RecipeDao
    override fun onResume() {
        super.onResume()
        setContent {
            MviApp(recipeDao)
        }
    }
}
