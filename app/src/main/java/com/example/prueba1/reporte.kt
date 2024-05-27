package com.example.prueba1

import android.content.Intent
import androidx.fragment.app.FragmentActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.fragment.app.FragmentManager
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class reporte : FragmentActivity(), OnMapReadyCallback {

    private lateinit var map:GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reporte)

        val volver1 = findViewById<ImageButton>(R.id.imageButton2)

        volver1.setOnClickListener {
            val url_volver = Intent(this, menu_principal::class.java)
            startActivity(url_volver)
        }
        createMapFragment()
    }

    private fun createMapFragment() {
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap : GoogleMap) {
        map = googleMap
        createMarker()
    }

    private fun createMarker() {
        val schoolPlace = LatLng(4.600993, -74.075880)
        map.addMarker(MarkerOptions().position(schoolPlace).title("´Sede de Ingenieria"))
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(schoolPlace, 18f),
            4000,
            null )
    }

}