package com.example.prueba1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)

        val olvido_contrasena = findViewById<Button>(R.id.olvidocontrasena);

    olvido_contrasena.setOnClickListener{
        val url_olvidation =Intent(this, contrasena::class.java);
        startActivity(url_olvidation);

}


    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Prueba1Theme {
//        Greeting("Android")
//    }
//}