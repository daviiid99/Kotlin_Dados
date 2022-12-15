package com.daviiid99.kotlin_clase

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

        val boton = findViewById<Button>(R.id.boton)
        var contador : Int = 0
        var juego = dados()
        var dados_img = findViewById<ImageView>(R.id.dados) // Banner
        var dice_1 = findViewById<ImageView>(R.id.dice_1)
        var dice_2 = findViewById<ImageView>(R.id.dice_2)
        var dices_images = listOf<Int>()
        var title = findViewById<TextView>(R.id.result)
        var suma = 0

        boton.setOnClickListener {
            // Throw the dices and get the result!

            // First, hide the dices example
            dados_img.visibility = View.GONE

            // Throw the dices
            juego.tirarDados()

            // Get the result
            dices_images = juego.getDados()

            // Change title with result
            suma = juego.getDicesSum()
            title.text = "Has sacado $suma"

            // Update dices result
            dice_1.setImageResource(dices_images[0])
            dice_2.setImageResource(dices_images[1])

            // Display current dices into display
            dice_1.visibility = View.VISIBLE
            dice_2.visibility = View.VISIBLE


            contador ++

        }
    }
}