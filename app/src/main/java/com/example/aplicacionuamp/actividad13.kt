package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class actividad13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad13)
    }

    fun actividaddigital(view: View) {
        val intent = Intent(this, actividad6()::class.java)
        startActivity(intent)
    }

    fun actividadwhatsapp(view: View) {
        val intent = Intent(this, actividad14()::class.java)
        startActivity(intent)
    }
}