package com.example.prueba1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class historico : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_historico)

        val volver3 = findViewById<ImageButton>(R.id.imageButton2)

        volver3.setOnClickListener {
            val url_volver = Intent(this, menu_principal::class.java)
            startActivity(url_volver)
        }
    }
}