package com.example.fuel_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

const val KEY_CONSUMO_CARRO = "ConsumoCarro.KEY_CONSUMO_CARRO"

class ConsumoCarro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_consumo_carro)

        val priceFuel = intent.getFloatExtra(KEY_CONSUMO_CARRO, 0f)

        val consumoCarro = findViewById<TextInputEditText>(R.id.edit_carconsuption)
        val btnProximo2 = findViewById<Button>(R.id.btn_2proximo)

        btnProximo2.setOnClickListener {

            val consumoCarroStr: String = consumoCarro.text.toString()

            val consumoCarroFlo: Float = consumoCarroStr.toFloat()

            val intentTerceira = Intent (this,Distance::class.java)
            intentTerceira.putExtra(KEY_DISTANCIA_CONSUMO, consumoCarroFlo )
            intentTerceira.putExtra(KEY_DISTANCIA_PRICEFUEL, priceFuel)

            startActivity(intentTerceira)

            println(priceFuel)
            println(consumoCarroFlo)
        }
    }
}