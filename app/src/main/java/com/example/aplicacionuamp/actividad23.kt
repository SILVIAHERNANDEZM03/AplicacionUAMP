package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class actividad23 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad23)
    }
    fun psicologíaAplicada(view: View){
        val intent = Intent(this, actividad8()::class.java)
        startActivity(intent)
    }
}