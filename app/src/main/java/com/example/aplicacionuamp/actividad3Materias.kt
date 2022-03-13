package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class actividad3Materias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad3_materias)
    }

    fun actividad(view: View) {
        val intent = Intent(this, MainActivity()::class.java)
        startActivity(intent)
    }

    fun actividadtareas(view: View) {
        val intent = Intent(this, actividad9()::class.java)
        startActivity(intent)
    }

    fun actividadcalificaciones(view: View) {
        val intent = Intent(this, actividad10()::class.java)
        startActivity(intent)
    }

    fun actividadcursos(view: View) {
        val intent = Intent(this, actividad11()::class.java)
        startActivity(intent)
    }

    fun actividad3(view: View) {
        val intent = Intent(this, actividad2iniciodesesion()::class.java)
        startActivity(intent)
    }
    fun horario(view: View) {
        val intent = Intent(this, actividad29()::class.java)
        startActivity(intent)
    }
}