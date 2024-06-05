package com.example.m016_clean_architecture.entity

// Создание данных в сущности
interface UsefulActivity {
    val activity: String?
    val type: String?
    val participants: Int?
    val price: Float?
    val link: String?
    val key: Int?
    val accessibility: Float?
}