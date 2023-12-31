package com.example.circassianrecipeapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.circassianrecipeapp.data.database.entity.Recipe
import kotlinx.coroutines.flow.Flow

@Dao
interface RecipeDao {

    @Query("SELECT * FROM recipes")
    fun getRecipes(): Flow<List<Recipe>>

    @Query("SELECT * FROM recipes WHERE id = :recipeId")
    fun getRecipeById(recipeId: Long): Flow<Recipe?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsertRecipe(recipe: Recipe)

    @Query("SELECT * FROM recipes WHERE isFavorite = 1")
    fun getFavoriteRecipes(): Flow<List<Recipe>>

    /* @Insert(onConflict = OnConflictStrategy.IGNORE)
      fun insertFavoriteRecipe(favoriteRecipe: FavoriteRecipe)
 */
    @Query("SELECT * FROM recipes WHERE category = :category")
    fun getRecipesByCategory(category: String): Flow<List<Recipe>>

    @Query("SELECT * FROM recipes WHERE name LIKE '%' || :query || '%'")
    fun searchRecipesByName(query: String): Flow<List<Recipe>>
}
