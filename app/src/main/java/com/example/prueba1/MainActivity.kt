package com.example.prueba1

import android.content.Intent
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)

        val isesion = findViewById<Button>(R.id.inicioSesionButton)
        val olvidocontrasena = findViewById<Button>(R.id.olvidocontrasena)
        val regis = findViewById<Button>(R.id.registro)


        isesion.setOnClickListener {
            val url_inisesion = Intent(this, menu_principal::class.java)
            startActivity(url_inisesion)
        }

        olvidocontrasena.setOnClickListener {
            val url_olvidocontrasena = Intent(this, contrasena::class.java)
            startActivity(url_olvidocontrasena)
        }

        regis.setOnClickListener {
            val url_registro = Intent(this, registro::class.java)
            startActivity(url_registro)
        }
    }
}