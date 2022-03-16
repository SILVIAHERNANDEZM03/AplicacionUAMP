package com.example.aplicacionuamp

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun Youtube(view: View) {
        val message: String? = null
        val url = "https://www.youtube.com/channel/UC5YEXRdbjIPAgKhCQPCgcvQ/featured"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }

    fun isAppInstalled(packageName: String, context: Context): Boolean {
        return try {
            val packageManager = context.packageManager
            packageManager.getPackageInfo(packageName, 0)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }}
    fun Facebook(view: View) {
        val message: String? = null
        val url = "https://www.facebook.com/uampteziutlan"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)

    fun isAppInstalled(packageName: String, context: Context): Boolean {
        return try {
            val packageManager = context.packageManager
            packageManager.getPackageInfo(packageName, 0)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }}}

    fun actividad2iniciodesesion(view: View) {
        val intent = Intent(this, actividad2iniciodesesion()::class.java)
        startActivity(intent)
    }

    fun actividadlicenciaturas(view: View) {
        val intent = Intent(this, actividad5()::class.java)
        startActivity(intent)
    }
    fun actividadwhatsapp(view: View) {
        val intent = Intent(this, actividad14()::class.java)
        startActivity(intent)
    }
    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(applicationContext, "Bienvenido", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onResume() {
        super.onResume()
        val toast = Toast.makeText(applicationContext, "Resumen", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(applicationContext, "Pausa", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(applicationContext, "onStop", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onRestart() {
        super.onRestart()
        val toast = Toast.makeText(applicationContext, "onRestart", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(applicationContext, "Finalizado", Toast.LENGTH_SHORT)
        toast.show()
    }


    fun Instag(view: View) {
        val message: String? = null
        val url = "https://www.instagram.com/uampteziutlan/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)

        fun isAppInstalled(packageName: String, context: Context): Boolean {
            return try {
                val packageManager = context.packageManager
                packageManager.getPackageInfo(packageName, 0)
                true
            } catch (e: PackageManager.NameNotFoundException) {
                false
            }}
    }}







