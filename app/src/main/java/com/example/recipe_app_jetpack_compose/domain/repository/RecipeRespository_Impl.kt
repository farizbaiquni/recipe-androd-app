package com.example.recipe_app_jetpack_compose.domain.repository

import com.example.recipe_app_jetpack_compose.domain.model.RecipeModel
import com.example.recipe_app_jetpack_compose.network.RecipeDtoMapper
import com.example.recipe_app_jetpack_compose.network.response.RecipeService

class RecipeRespository_Impl(
    private val recipeService: RecipeService,
    private val recipeDtoMapper: RecipeDtoMapper
): RecipeRepository{
    override suspend fun search(token: String, page: String, query: String): List<RecipeModel> {
        return recipeDtoMapper.toDomainModel(recipeService.search(token, page, query).recipes)
    }

    override suspend fun get(token: String, id: String): RecipeModel {
        return recipeDtoMapper.mapToDomainModel(recipeService.get(token, id))
    }
}