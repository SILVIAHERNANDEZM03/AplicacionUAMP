package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class actividad9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad9)
    }

    fun actividadtareas(view: View) {
        val intent = Intent(this, actividad3Materias()::class.java)
        startActivity(intent)
    }
}