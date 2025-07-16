package com.rovu.yusufapi.data

import com.google.gson.annotations.SerializedName

data class Course(
    @SerializedName("id")
    val id: Int,

    @SerializedName("title")
    val title: String,

    @SerializedName("excerpt")
    val excerpt: String,

    @SerializedName("image")
    val imageUrl: String,

    @SerializedName("level")
    val level: String
)
