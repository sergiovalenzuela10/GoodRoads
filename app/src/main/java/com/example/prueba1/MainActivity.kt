package com.example.prueba1

import android.content.Intent
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)

        val isesion = findViewById<Button>(R.id.inicioSesionButton)
        val olvidocontrase = findViewById<Button>(R.id.olvidoContrasena1)
        val regis = findViewById<Button>(R.id.registro)
        val users = Users.usuario

        isesion.setOnClickListener {
            val email = findViewById<EditText>(R.id.correo_inicio).text.toString()
            val password = findViewById<EditText>(R.id.contrasena_inicio).text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Algun campo esta vacio", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (email == users["email"] && password == users["password"]) {
                val intent = Intent(this, menu_principal::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "El email o contraseña son incorrectas", Toast.LENGTH_SHORT).show()
            }
        }

        olvidocontrase.setOnClickListener {
            val url_olvidocontrasena = Intent(this, contrasena::class.java)
            startActivity(url_olvidocontrasena)
        }

        regis.setOnClickListener {
            val url_registro = Intent(this, registro::class.java)
            startActivity(url_registro)
        }
    }
}
