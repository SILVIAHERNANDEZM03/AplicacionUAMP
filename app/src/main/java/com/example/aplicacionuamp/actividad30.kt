package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class actividad30 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad30)
    }
    fun nutricionclinica(view: View){
        val intent = Intent(this, actividad7()::class.java)
        startActivity(intent)
    }
}