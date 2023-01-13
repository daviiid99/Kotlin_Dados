package com.daviiid99.kotlin_clase

import android.annotation.SuppressLint
import android.content.ContentResolver
import android.content.Context
import android.graphics.drawable.Drawable
import android.provider.Settings.System.getString
import androidx.core.content.res.TypedArrayUtils.getText
import kotlin.random.Random

class dados {

    var dado1 : Int = 0
    var dado2 : Int = 0
    var posiciones = listOf<Int>(1,2,3,4,5,6)
    var dadosPosiciones = listOf<Int>()
    var dices_images = listOf<Int>(R.drawable.dado_1, R.drawable.dado_2, R.drawable.dado_3, R.drawable.dado_4, R.drawable.dado_5, R.drawable.dado_6)
    var dices_sum = 0


    fun getSum(dado1 : Int, dado2 : Int): Int{
        return  dado1 + dado2
    }

    fun tirarDados(){
        // Generate random positions from 1 to 6
        dado1 = Random.nextInt(posiciones[0], posiciones[posiciones.size - 1])
        dado2 = Random.nextInt(posiciones[0], posiciones[posiciones.size - 1])
        print("dado1 : $dado1")
        print("dado2 : $dado2")
        dices_sum = getSum(dado1, dado2)
    }

    fun getDicesSum () : Int {
        return dices_sum
    }

    @SuppressLint("RestrictedApi")
    fun getDicesPhrase(context : Context) : String {
        // Return a original phrase based on dices result


        var phrase : String = when(getDicesSum()){
         2 -> context.getString( R.string.frase_2) as String
         3 -> context.getString( R.string.frase_3)
         4 -> context.getString( R.string.frase_4)
         5 -> context.getString( R.string.frase_5)
         6 -> context.getString( R.string.frase_6)
         7 -> context.getString( R.string.frase_7)
         8 -> context.getString( R.string.frase_8)
         9 -> context.getString( R.string.frase_9)
         10 ->context.getString( R.string.frase_10)
         11 ->context.getString( R.string.frase_11)
         else ->context.getString( R.string.frase_12)
        }

        println(phrase);
        return phrase;
    }

    fun getDados() : List<Int>{
      return listOf<Int>(dices_images[dado1 -1], dices_images[dado2 -1])
    }


}