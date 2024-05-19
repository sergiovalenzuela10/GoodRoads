package com.example.prueba1

import android.content.Intent
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge

class registro : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro)

        val reisesion = findViewById<Button>(R.id.regresarinicio)
        val registrarse = findViewById<Button>(R.id.registrarse)

        reisesion.setOnClickListener {
            val url_reisesion = Intent(this, MainActivity::class.java)
            startActivity(url_reisesion)
        }

        registrarse.setOnClickListener {
            val url_registrarse = Intent(this, menu_principal::class.java)
            startActivity(url_registrarse)

        }
    }
}