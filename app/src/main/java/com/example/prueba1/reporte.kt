package com.example.prueba1

import android.content.Intent
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.GoogleMap

class reporte : ComponentActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reporte)

        val txtLatitud = findViewById<EditText>(R.id.txtLatitud)
        val txtLongitud = findViewById<EditText>(R.id.txtLongitud)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.setOnMapClickListener { latLng ->
            // Implementación del listener para clicks en el mapa
        }
        mMap.setOnMapLongClickListener { latLng ->
            // Implementación del listener para clicks largos en el mapa
        }
    }
}