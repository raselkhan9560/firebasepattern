package com.phoenix.fpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codestone.firebasepattern.FirebasePattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FirebasePattern().getOccupationPattern("Hello")
    }
}