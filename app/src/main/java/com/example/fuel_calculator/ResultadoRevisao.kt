package com.example.fuel_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val KEY_RESULTADO_REVISAO = "ResultadoRevisao.KEY_RESULTADO_REVISAO"
const val KEY_FUEL_REVISAO = "ResultadoRevisão.KEY_FUEL_REVISÃO"
const val KEY_CONSUMO_REVISAO = "ResultadoRevisão.KEY_CONSUMO_REVISÃO"
const val KEY_DISTANCE_REVISAO = "ResultadoRevisão.KEY_DISTANCE_REVISÃO"

class ResultadoRevisao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_resultado_revisao)

        val gastoTotal = intent.getFloatExtra(KEY_RESULTADO_REVISAO, 0F)

        val tvGastoTotal = findViewById<TextView>(R.id.tv_resultadogastototal)

        tvGastoTotal.text = gastoTotal.toString()


        val fuelRevisao = intent.getFloatExtra(KEY_FUEL_REVISAO, 0F)

        val tvFuelRevisao = findViewById<TextView>(R.id.tv_numeralpreçofuel)

        tvFuelRevisao.text = fuelRevisao.toString()


        val consumoRevisao = intent.getFloatExtra(KEY_CONSUMO_REVISAO, 0F)

        val tvConsumoRevisao = findViewById<TextView>(R.id.tv_numeralconsumo)

        tvConsumoRevisao.text = consumoRevisao.toString()


        val distanceRevisao = intent.getFloatExtra(KEY_DISTANCE_REVISAO, 0F)

        val tvDistanceRevisao = findViewById<TextView>(R.id.tv_numeraldistancia)

        tvDistanceRevisao.text = distanceRevisao.toString()


        val btnCalculoNovo = findViewById<Button>(R.id.btn_novocalculo)

        btnCalculoNovo.setOnClickListener {

            val intentRestart = Intent (this, MainActivity::class.java)

            startActivity(intentRestart)

            println("voltei otário")

        }

    }
}