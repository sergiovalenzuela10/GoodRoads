package com.example.prueba1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class menu_principal : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_principal)

        val histori = findViewById<Button>(R.id.historico)
        val cal = findViewById<ImageButton>(R.id.danos)
        val luminaria = findViewById<ImageButton>(R.id.luz)
        val aler = findViewById<ImageButton>(R.id.inseguros)

        histori.setOnClickListener {
            val url_historic = Intent(this, historico::class.java)
            startActivity(url_historic)
        }

        cal.setOnClickListener {
            val url_cal = Intent(this, reporte::class.java)
            startActivity(url_cal)
        }

        luminaria.setOnClickListener {
            val url_luminaria= Intent(this, reporte::class.java)
            startActivity(url_luminaria)
        }

        aler.setOnClickListener {
            val url_aler = Intent(this, reporte::class.java)
            startActivity(url_aler)
        }
    }
}