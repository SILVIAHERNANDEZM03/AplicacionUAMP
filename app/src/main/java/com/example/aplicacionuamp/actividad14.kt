package com.example.aplicacionuamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class actividad14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad14)

        val mensaje = findViewById<EditText>(R.id.message)
        val whatsapp = findViewById<Button>(R.id.whatsapp)

        whatsapp.setOnClickListener {
            val mensaje = mensaje.text.toString()
            sendMessage(mensaje);
        }
    }
    fun sendMessage(message: String){

        val intent = Intent (Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.setPackage("com.Whatsapp")
        intent.putExtra(Intent.EXTRA_TEXT, message)

        if (intent.resolveActivity(packageManager) == null){
            Toast.makeText(this,"Primero instala WhatsApp", Toast.LENGTH_SHORT).show()
            return

        }
        startActivity(intent)
    }
}