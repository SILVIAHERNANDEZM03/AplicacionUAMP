package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class actividad2iniciodesesion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2iniciodesesion)
    }

    fun actividad3Materias(view: View) {
        val intent = Intent(this, actividad3Materias()::class.java)
        startActivity(intent)
    }

    fun actividad1(view: View) {
        val intent = Intent(this, MainActivity()::class.java)
        startActivity(intent)
    }
}