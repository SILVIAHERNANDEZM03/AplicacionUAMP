package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class actividad7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad7)
    }
    fun actividadsalud(view: View) {
        val intent = Intent(this, actividad5()::class.java)
        startActivity(intent)
    }
    fun actividadenfermeria(view: View){
        val intent = Intent(this, actividad16()::class.java)
        startActivity(intent)
    }
    fun actividadfisioterapia(view: View){
        val intent = Intent(this, actividad17()::class.java)
        startActivity(intent)
    }
    fun nutricionclinica(view: View){
        val intent = Intent(this, actividad30()::class.java)
        startActivity(intent)
    }
}