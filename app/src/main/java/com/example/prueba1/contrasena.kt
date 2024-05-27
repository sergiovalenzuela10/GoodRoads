package com.example.prueba1

import android.content.Intent
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.widget.ImageButton

class contrasena : ComponentActivity() {

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_contrasena)

        val volver = findViewById<ImageButton>(R.id.imageButton)

        volver.setOnClickListener {
            val url_volver = Intent(this, MainActivity::class.java)
            startActivity(url_volver)
        }

        }
    }
