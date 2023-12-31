package com.example.circassianrecipeapp.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorites")
data class FavoriteRecipe(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val favoriteId: Int,
    val recipeId: Int
)