package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class actividad21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad21)
    }
    fun estilismoycosmetología(view: View){
        val intent = Intent(this, actividad8()::class.java)
        startActivity(intent)
    }
}