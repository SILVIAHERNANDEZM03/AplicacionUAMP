package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Actividad4licenciaturas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad4licenciaturas)
    }
    fun actividadregresar(view: View) {
        val intent = Intent(this, actividad5()::class.java)
        startActivity(intent)
    }
    fun administracióndeEmpresas(view: View) {
        val intent = Intent(this, actividad25()::class.java)
        startActivity(intent)
    }
    fun contaduríapublica(view: View) {
        val intent = Intent(this, actividad26()::class.java)
        startActivity(intent)
    }
    fun gastronomíayTurismo(view: View) {
        val intent = Intent(this, actividad27()::class.java)
        startActivity(intent)
    }
    fun negociosInternacionales(view: View) {
        val intent = Intent(this, actividad28()::class.java)
        startActivity(intent)
    }
    fun administracionDeportiva(view: View) {
        val intent = Intent(this, actividad31()::class.java)
        startActivity(intent)
    }
    fun marketingDigital(view: View) {
        val intent = Intent(this, actividad32()::class.java)
        startActivity(intent)
    }

}
