package com.daviscodesbugs.klockissue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.soywiz.klock.DateTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val now = DateTime.now()
        println("Now: $now")
    }
}