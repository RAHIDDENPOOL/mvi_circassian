package com.example.circassianrecipeapp.data.repository

import com.example.circassianrecipeapp.R
import com.example.circassianrecipeapp.data.dao.RecipeDao
import com.example.circassianrecipeapp.data.database.entity.Recipe
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RecipeRepository @Inject constructor (private val recipeDao: RecipeDao) {
    suspend fun initializeDataBase() {
        val allRecipes = listOf(
            Recipe(1, R.drawable.dish_one, "Черкесский гуляш", "Сладости", "", "Это оригинальное блюдо Черкесской кухни готовится из говядины", false),
            Recipe(2, R.drawable.dish_two, "Лягур с пастой", "Мясное блюдо", "", "Мясо промываем в холодной воде. Мясо зачищаем от мелких костей, пленки и сухожилий и еще раз промываем в холодной проточной воде", false),
            Recipe(3, R.drawable.dish_one, "Гедлибже из курицы", "Суп", "", "Ставим на большой огонь и быстро доведем до кипения, затем уменьшим нагрев и начнем варить", false),
            Recipe(4, R.drawable.dish_two, "Лакум", "", "Мучные изделия", "Пока варится мясо, на верху кастрюли будет собираться жир и пена, ее обязательно нужно снимать (пена может придать горечь и неприятный запах нашему мясу и бульону)\"", false),
            Recipe(5, R.drawable.dish_one, "Ритуальный суп из вяленого мяса (Ашрык)", "Салат", "", "Варка считается законченной, если волокна мяса можно отрывать друг от друга руками", false),
            Recipe(6, R.drawable.dish_two, "Черкесский омлет", "Напитки", "", "Как только мясо готово, мы расщепим мясо мелкими кусками и переложим в тарелку", false),
            Recipe(7, R.drawable.dish_one, "Черкесский гуляш", "Сладости", "", "Это оригинальное блюдо Черкесской кухни готовится из говядины", false),
            Recipe(8, R.drawable.dish_two, "Лягур с пастой", "Мясное блюдо", "", "Мясо промываем в холодной воде. Мясо зачищаем от мелких костей, пленки и сухожилий и еще раз промываем в холодной проточной воде", false),
            Recipe(9, R.drawable.dish_one, "Гедлибже из курицы", "Суп", "", "Ставим на большой огонь и быстро доведем до кипения, затем уменьшим нагрев и начнем варить", false),
            Recipe(10, R.drawable.dish_two, "Лакум", "", "Мучные изделия", "Пока варится мясо, на верху кастрюли будет собираться жир и пена, ее обязательно нужно снимать (пена может придать горечь и неприятный запах нашему мясу и бульону)\"", false),
            Recipe(11, R.drawable.dish_one, "Ритуальный суп из вяленого мяса (Ашрык)", "Салат", "", "Варка считается законченной, если волокна мяса можно отрывать друг от друга руками", false),
            Recipe(12, R.drawable.dish_two, "Черкесский омлет", "Напитки", "", "Как только мясо готово, мы расщепим мясо мелкими кусками и переложим в тарелку", false),
            Recipe(13, R.drawable.dish_one, "Черкесский гуляш", "Сладости", "", "Это оригинальное блюдо Черкесской кухни готовится из говядины", false),
            Recipe(14, R.drawable.dish_two, "Лягур с пастой", "Мясное блюдо", "", "Мясо промываем в холодной воде. Мясо зачищаем от мелких костей, пленки и сухожилий и еще раз промываем в холодной проточной воде", false),
            Recipe(15, R.drawable.dish_one, "Гедлибже из курицы", "Суп", "", "Ставим на большой огонь и быстро доведем до кипения, затем уменьшим нагрев и начнем варить", false),
            Recipe(16, R.drawable.dish_two, "Лакум", "", "Мучные изделия", "Пока варится мясо, на верху кастрюли будет собираться жир и пена, ее обязательно нужно снимать (пена может придать горечь и неприятный запах нашему мясу и бульону)\"", false),
            Recipe(17, R.drawable.dish_one, "Ритуальный суп из вяленого мяса (Ашрык)", "Салат", "", "Варка считается законченной, если волокна мяса можно отрывать друг от друга руками", false),
            Recipe(18, R.drawable.dish_two, "Черкесский омлет", "Напитки", "", "Как только мясо готово, мы расщепим мясо мелкими кусками и переложим в тарелку", false),
            Recipe(19, R.drawable.dish_one, "Черкесский гуляш", "Сладости", "", "Это оригинальное блюдо Черкесской кухни готовится из говядины", false),
            Recipe(20, R.drawable.dish_two, "Лягур с пастой", "Мясное блюдо", "", "Мясо промываем в холодной воде. Мясо зачищаем от мелких костей, пленки и сухожилий и еще раз промываем в холодной проточной воде", false),
            Recipe(21, R.drawable.dish_one, "Гедлибже из курицы", "Суп", "", "Ставим на большой огонь и быстро доведем до кипения, затем уменьшим нагрев и начнем варить", false),
            Recipe(22, R.drawable.dish_two, "Лакум", "", "Мучные изделия", "Пока варится мясо, на верху кастрюли будет собираться жир и пена, ее обязательно нужно снимать (пена может придать горечь и неприятный запах нашему мясу и бульону)\"", false),
            Recipe(23, R.drawable.dish_one, "Ритуальный суп из вяленого мяса (Ашрык)", "Салат", "", "Варка считается законченной, если волокна мяса можно отрывать друг от друга руками", false),
            Recipe(24, R.drawable.dish_two, "Черкесский омлет", "Напитки", "", "Как только мясо готово, мы расщепим мясо мелкими кусками и переложим в тарелку", false),
            )
        for (recipe in allRecipes) {
            recipeDao.upsertRecipe(recipe)
        }
    }
    suspend fun getRecipes(): Flow<List<Recipe>> {
        return recipeDao.getRecipes()
    }
}