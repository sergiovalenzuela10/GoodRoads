package com.example.prueba1

import android.content.Intent
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import com.google.firebase.auth.FirebaseAuth

class contrasena : ComponentActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contrasena)

        auth = FirebaseAuth.getInstance()

        val volver = findViewById<ImageButton>(R.id.imageButton)
//        val emailText = findViewById<EditText>(R.id.correoRecuperar)
//        val buttonCodigo = findViewById<Button>(R.id.enviarCodigo)

        volver.setOnClickListener {
            val url_volver = Intent(this, MainActivity::class.java)
            startActivity(url_volver)
        }

//        buttonCodigo.setOnClickListener {
//            val email = emailText.text.toString().trim()
//
//            if (email.isEmpty()) {
//                Toast.makeText(this, "Por favor, ingrese su correo electrónico", Toast.LENGTH_SHORT).show()
//                return@setOnClickListener
//            }
//
//            sendPasswordResetEmail(email)
//        }
//    }
//
//    private fun sendPasswordResetEmail(email: String) {
//        auth.sendPasswordResetEmail(email)
//            .addOnCompleteListener { task ->
//                if (task.isSuccessful) {
//                    Toast.makeText(this, "Se ha enviado un correo de restablecimiento", Toast.LENGTH_SHORT).show()
//                } else {
//                    Toast.makeText(this, "Error al enviar el correo de restablecimiento", Toast.LENGTH_SHORT).show()
//                }
//            }
    }
}
