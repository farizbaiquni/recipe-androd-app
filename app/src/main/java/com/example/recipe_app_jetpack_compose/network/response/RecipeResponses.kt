package com.example.recipe_app_jetpack_compose.network.response

import com.example.recipe_app_jetpack_compose.network.RecipeDto
import com.google.gson.annotations.SerializedName

data class RecipeResponses (
    @SerializedName("count")
    val count: Int,

    @SerializedName("result")
    var recipes: List<RecipeDto>

    )