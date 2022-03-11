package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class actividad26 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad26)
    }
    fun contaduríapublica(view: View) {
        val intent = Intent(this, Actividad4licenciaturas()::class.java)
        startActivity(intent)
    }
}