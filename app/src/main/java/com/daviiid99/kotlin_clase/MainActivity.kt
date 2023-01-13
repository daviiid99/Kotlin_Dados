package com.daviiid99.kotlin_clase

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var contador : Int = 0
        var juego = dados()
        var dices_images = listOf<Int>()
        var suma = 0

        findViewById<Button>(R.id.boton).setOnClickListener {
            // Throw the dices and get the result!

            // First, hide the dices example
            findViewById<ImageView>(R.id.dados).visibility = View.GONE

            // Throw the dices
            juego.tirarDados()

            // Get the result
            dices_images = juego.getDados()

            // Change title with result
            suma = juego.getDicesSum()
            findViewById<TextView>(R.id.result).text = "Has sacado $suma"

            // Update dices result
            findViewById<ImageView>(R.id.dice_1).setImageResource(dices_images[0])
            findViewById<ImageView>(R.id.dice_2).setImageResource(dices_images[1])

            // Display current dices into display
            findViewById<ImageView>(R.id.dice_1).visibility = View.VISIBLE
            findViewById<ImageView>(R.id.dice_2).visibility = View.VISIBLE

            // Display current phrase
            findViewById<TextView>(R.id.frase).text = "${juego.getDicesPhrase(this )}";


            contador ++

        }
    }
}