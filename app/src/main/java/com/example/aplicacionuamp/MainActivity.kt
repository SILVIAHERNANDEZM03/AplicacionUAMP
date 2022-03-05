package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun actividad2iniciodesesion(view: View) {
        val intent = Intent(this, actividad2iniciodesesion()::class.java)
        startActivity(intent)
    }

    fun actividadlicenciaturas(view: View) {
        val intent = Intent(this, actividad5()::class.java)
        startActivity(intent)
    }
}