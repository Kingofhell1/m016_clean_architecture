package com.example.m016_clean_architecture.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.example.m016_clean_architecture.entity.UsefulActivity

// Наследуем и переопределяем данные сущности
@JsonClass(generateAdapter = true)
data class UsefulActivityDto(
    @Json(name = "activity")
    override val activity: String?,
    @Json(name = "type")
    override val type: String?,
    @Json(name = "participants")
    override val participants: Int?,
    @Json(name = "price")
    override val price: Float?,
    @Json(name = "link")
    override val link: String?,
    @Json(name = "key")
    override val key: Int?,
    @Json(name = "accessibility")
    override val accessibility: Float?

) : UsefulActivity