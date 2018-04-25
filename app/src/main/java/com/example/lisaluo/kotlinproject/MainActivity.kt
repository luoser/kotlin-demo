package com.example.lisaluo.kotlinproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configureWith(Person.IZZY)
    }

    fun configureWith(type: Person) {

    }
}
