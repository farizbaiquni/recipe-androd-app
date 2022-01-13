package com.example.recipe_app_jetpack_compose.domain.repository

import com.example.recipe_app_jetpack_compose.domain.model.RecipeModel

interface RecipeRepository {
    suspend fun search(token: String, page: String, query: String): List<RecipeModel>
    suspend fun get(token: String, id: String): RecipeModel
}