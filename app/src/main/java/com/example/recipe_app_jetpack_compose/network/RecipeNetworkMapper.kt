package com.example.recipe_app_jetpack_compose.network

import com.example.recipe_app_jetpack_compose.domain.model.RecipeModel
import com.example.recipe_app_jetpack_compose.domain.util.EntityMapper

class RecipeNetworkMapper: EntityMapper<RecipeNetworkEntity, RecipeModel> {
    override fun mapFromEntity(entity: RecipeNetworkEntity): RecipeModel {
        return RecipeModel(
            entity.pk,
            entity.title,
            entity.publisher,
            entity.featuredImage,
            entity.rating,
            entity.sourceUrl,
            entity.description,
            entity.cookingInstructions,
            entity.ingredients?: listOf(),
            entity.dateAdded,
            entity.dateUpdated,
            entity.longDateAdded,
            entity.longDateUpdated,
        )
    }

    override fun mapToEntity(recipeModel: RecipeModel): RecipeNetworkEntity {
        return RecipeNetworkEntity(
            recipeModel.id,
            recipeModel.title,
            recipeModel.publisher,
            recipeModel.featuredImage,
            recipeModel.rating,
            recipeModel.sourceUrl,
            recipeModel.description,
            recipeModel.cookingInstructions,
            recipeModel.ingredients?: listOf(),
            recipeModel.dateAdded,
            recipeModel.dateUpdated,
            recipeModel.longDateAdded,
            recipeModel.longDateUpdated,
        )
    }

    fun fromEntityList (data: List<RecipeNetworkEntity>): List<RecipeModel> {
        return data.map { mapFromEntity(it) }
    }

    fun toEntityList (data: List<RecipeModel>): List<RecipeNetworkEntity>{
        return data.map { mapToEntity(it) }
    }
}