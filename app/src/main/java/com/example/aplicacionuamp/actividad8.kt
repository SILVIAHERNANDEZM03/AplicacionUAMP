package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class actividad8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad8)
    }

    fun actividadsociales(view: View) {
        val intent = Intent(this, actividad5()::class.java)
        startActivity(intent)
    }
    fun acondicionamientofisico(view: View){
        val intent = Intent(this, actividad18()::class.java)
        startActivity(intent)
    }
    fun criminologiaycriminalista(view: View){
        val intent = Intent(this, actividad19()::class.java)
        startActivity(intent)
    }
    fun derecho(view: View){
        val intent = Intent(this, actividad20()::class.java)
        startActivity(intent)
    }
}