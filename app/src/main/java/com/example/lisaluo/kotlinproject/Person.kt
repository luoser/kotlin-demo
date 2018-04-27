package com.example.lisaluo.kotlinproject

enum class Person(val firstName: String, val favoriteColor: Int, val emojiImageId: Int) {
    IZZY("Izzy", R.color.blue, R.mipmap.sleuth_or_spy),
    LISA("Lisa", R.color.chartreuse, R.mipmap.dancer),
    KEVIN("Kevin", R.color.red, R.mipmap.thinking_face)
}
