package com.example.lisaluo.kotlinproject

enum class Person(val firstName: String, val favoriteColor: Int, val emojiImageId: Int) {
    IZZY("Izzy", R.color.blue, R.drawable.izzy),
    LISA("Lisa", R.color.chartreuse, R.drawable.lisa),
    KEVIN("Kevin", R.color.red, R.drawable.kevin)
}
