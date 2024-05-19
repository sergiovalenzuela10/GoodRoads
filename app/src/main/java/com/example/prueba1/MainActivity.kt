package com.example.prueba1

import android.content.Intent
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)


        val olvidocontrasena = findViewById<Button>(R.id.olvidocontrasena)
        val regis = findViewById<Button>(R.id.registro)

        olvidocontrasena.setOnClickListener{
            val url_olvidocontrasena = Intent(this, contrasena::class.java)
            startActivity(url_olvidocontrasena)
        }

        regis.setOnClickListener{
            val url_registro = Intent(this, registro::class.java)
            startActivity(url_registro)

                    }

                }

            }