package com.example.recipe_app_jetpack_compose.domain.util

interface DomainMapper<T, RecipeModel> {
    fun mapToDomainModel(entity: T): RecipeModel
    fun mapFromDomainModel(recipeModel: RecipeModel): T
}