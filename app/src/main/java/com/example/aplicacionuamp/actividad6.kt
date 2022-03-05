package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class actividad6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad6)
    }
    fun actividad6(view: View) {
        val intent = Intent(this, actividad5()::class.java)
        startActivity(intent)
    }
    fun actividadingenieriacilvil(view: View) {
        val intent = Intent(this, actividad12()::class.java)
        startActivity(intent)
    }
    fun actividaddigital(view: View) {
        val intent = Intent(this, actividad13()::class.java)
        startActivity(intent)
    }
}