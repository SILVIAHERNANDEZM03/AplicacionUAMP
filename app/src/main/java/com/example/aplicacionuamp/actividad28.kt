package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class actividad28 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad28)
    }

    fun negociosInternacionales(view: View) {
        val intent = Intent(this, Actividad4licenciaturas()::class.java)
        startActivity(intent)
    }
}