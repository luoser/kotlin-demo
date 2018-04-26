package com.example.lisaluo.kotlinproject

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configureWith(Person.IZZY)
    }

    private fun configureWith(p: Person) {
        AnimationUtils.backgroundColorAnimation(content, ContextCompat.getColor(this,p.favoriteColor)).start()
    }
}
