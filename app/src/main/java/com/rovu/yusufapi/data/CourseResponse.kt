package com.rovu.yusufapi.data

import com.google.gson.annotations.SerializedName

data class CoursesResponse(
    @SerializedName("data")
    val data: List<Course>
)
