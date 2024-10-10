package com.example.fuel_calculator

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val KEY_RESULTADO_REVISAO = "ResultadoRevisao.KEY_RESULTADO_REVISAO"

class ResultadoRevisao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_resultado_revisao)

        val gastoTotal = intent.getFloatExtra(KEY_RESULTADO_REVISAO, 0F)

        val tvGastoTotal = findViewById<TextView>(R.id.tv_resultadogastototal)

        tvGastoTotal.text = gastoTotal.toString()


    }
}