package com.example.fuel_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIniciar = findViewById<Button>(R.id.btn_iniciar)

        btnIniciar.setOnClickListener {

            val intentPrimeira = Intent(this,PriceFuel::class.java)
            startActivity(intentPrimeira)

            println("tô aqui otário")

        }
    }
}