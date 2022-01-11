package com.example.recipe_app_jetpack_compose.network.response

import com.example.recipe_app_jetpack_compose.network.RecipeNetworkEntity
import com.google.gson.annotations.SerializedName

class RecipeResponses (
    @SerializedName("count")
    val count: Int,

    @SerializedName("result")
    var recipe: List<RecipeNetworkEntity>

    )