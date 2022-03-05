package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class actividad5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad5)
    }

    fun actividad4(view: View) {
        val intent = Intent(this, Actividad4licenciaturas()::class.java)
        startActivity(intent)
    }

    fun actividadre(view: View) {
        val intent = Intent(this, MainActivity()::class.java)
        startActivity(intent)
    }

    fun actividadingenierias(view: View) {
        val intent = Intent(this, actividad6()::class.java)
        startActivity(intent)
    }

    fun actividadsalud(view: View) {
        val intent = Intent(this, actividad7()::class.java)
        startActivity(intent)
    }

    fun actividadsociales(view: View) {
        val intent = Intent(this, actividad8()::class.java)
        startActivity(intent)
    }
}