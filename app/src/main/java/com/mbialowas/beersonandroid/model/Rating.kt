package com.mbialowas.beersonandroid.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Rating(
    @Json(name = "average")
    val average: Double,
    @Json(name = "reviews")
    val reviews: Int
)