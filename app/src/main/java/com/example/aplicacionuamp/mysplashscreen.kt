package com.example.aplicacionuamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class mysplashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.Theme_AplicacionUAMP)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysplashscreen)
    }
}
