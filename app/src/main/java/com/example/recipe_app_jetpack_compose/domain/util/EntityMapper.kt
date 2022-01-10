package com.example.recipe_app_jetpack_compose.domain.util

interface EntityMapper<Entity, RecipeModel> {
    fun mapFromEntity(entity: Entity): RecipeModel
    fun mapToEntity(recipeModel: RecipeModel): Entity
}