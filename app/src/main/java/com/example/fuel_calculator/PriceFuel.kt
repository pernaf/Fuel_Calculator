package com.example.fuel_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class PriceFuel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_price_fuel)

        val priceFuel = findViewById<TextInputEditText>(R.id.edit_pricefuel)
        val btnProximo = findViewById<Button>(R.id.btn_proximo)

        btnProximo.setOnClickListener {

            val priceFuelStr: String = priceFuel.text.toString()

            if (priceFuelStr == "") {
                Snackbar
                    .make(
                        priceFuel,
                        "Preencha o campo vazio",
                        Snackbar.LENGTH_LONG
                    )
                    .show()

            } else {
                val priceFuelFlo: Float = priceFuelStr.toFloat()


                val intentSegunda = Intent(this, ConsumoCarro::class.java)
                intentSegunda.putExtra(KEY_CONSUMO_CARRO, priceFuelFlo)

                startActivity(intentSegunda)

                println("tô aqui otário2 " + priceFuelFlo)
            }
        }
    }
}