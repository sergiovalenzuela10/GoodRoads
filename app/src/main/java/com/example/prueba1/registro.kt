package com.example.prueba1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class registro : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro)

        val buttonRegistroUsuario = findViewById<Button>(R.id.registrarse)
        val volverini = findViewById<Button>(R.id.volverInicio)

        buttonRegistroUsuario.setOnClickListener {

            val name = findViewById<EditText>(R.id.nombre).text.toString()
            val apellido = findViewById<EditText>(R.id.apellidos).text.toString()
            val documento = findViewById<EditText>(R.id.documento).text.toString()
            val email = findViewById<EditText>(R.id.correo).text.toString()
            val password = findViewById<EditText>(R.id.contrasena).text.toString()

            if (password == "" || name == "" || apellido == "" ||documento == "" || email ==""){
                Toast.makeText(this, "Algun campo esta vacio", Toast.LENGTH_SHORT).show()
            }else{
                Users.usuario = mutableMapOf(
                    "name" to name,
                    "apellido" to apellido,
                    "documento" to documento,
                    "email" to email,
                    "password" to password,
                );
                Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_SHORT).show()
                val url_registro2 = Intent(this, MainActivity::class.java)
                startActivity(url_registro2)
                finish()
            }

        }
        volverini.setOnClickListener {
            val url_volverinic = Intent(this, MainActivity::class.java)
            startActivity(url_volverinic)
        }
    }
}
object Users{
    var usuario: MutableMap<String, String> = mutableMapOf()
}

