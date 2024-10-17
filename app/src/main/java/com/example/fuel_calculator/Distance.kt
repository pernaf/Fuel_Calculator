package com.example.fuel_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

const val KEY_DISTANCIA_CONSUMO = "Distance.KEY_DISTANCIA_CONSUMO"
const val KEY_DISTANCIA_PRICEFUEL = "Distance.KEY_DISTANCIA_PRICEFUEL"

class Distance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_distance)

        val priceFuel = intent.getFloatExtra(KEY_DISTANCIA_PRICEFUEL, 0F)
        val consumoCarro = intent.getFloatExtra(KEY_DISTANCIA_CONSUMO, 0F)

        val distanciaDestino = findViewById<TextInputEditText>(R.id.distancia_destino)
        val btnResultado = findViewById<Button>(R.id.btn_resultado)

        btnResultado.setOnClickListener {

            val distanciaDestinoStr: String = distanciaDestino.text.toString()

            if (distanciaDestinoStr == "") {
                Snackbar
                    .make(
                        distanciaDestino,
                        "Preencha o campo vazio",
                        Snackbar.LENGTH_LONG
                    )
                    .show()

            } else {
                val distanciaDestinoFlo: Float = distanciaDestinoStr.toFloat()

                val qtdGasol = distanciaDestinoFlo / consumoCarro
                val gastoTotal = qtdGasol * priceFuel

                val intentQuarta = Intent(this, ResultadoRevisao::class.java)
                intentQuarta.putExtra(KEY_RESULTADO_REVISAO, gastoTotal)
                intentQuarta.putExtra(KEY_FUEL_REVISAO, priceFuel)
                intentQuarta.putExtra(KEY_CONSUMO_REVISAO, consumoCarro)
                intentQuarta.putExtra(KEY_DISTANCE_REVISAO, distanciaDestinoFlo)

                startActivity(intentQuarta)

                println(gastoTotal)
            }
        }
    }
}