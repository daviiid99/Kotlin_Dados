package com.daviiid99.kotlin_clase

import android.graphics.drawable.Drawable
import kotlin.random.Random

class dados {

    var dado1 : Int = 0
    var dado2 : Int = 0
    var posiciones = listOf<Int>(1,2,3,4,5,6)
    var dadosPosiciones = listOf<Int>()
    var dices_images = listOf<Int>(R.drawable.dado_1, R.drawable.dado_2, R.drawable.dado_3, R.drawable.dado_4, R.drawable.dado_5, R.drawable.dado_6)
    var dices_sum = 0


    fun getSum(dado1 : Int, dado2 : Int): Int{

        var result_1 = when (dado1) {
            0 -> 1
            1 -> 2
            2 -> 3
            3 -> 4
            4 -> 5
            else -> 6
        }

         var result_2 = when(dado2){
             0 -> 1
             1 -> 2
             2 -> 3
             3 -> 4
             4 -> 5
             else -> 6
        }

        return  result_1 + result_2
    }

    fun tirarDados(){
        // Generate random positions from 1 to 6
        dado1 = Random.nextInt(posiciones[0], posiciones[posiciones.size - 1])
        dado2 = Random.nextInt(posiciones[0], posiciones[posiciones.size - 1])
        dices_sum = getSum(dado1, dado2)
    }

    fun getDicesSum () : Int {
        return dices_sum
    }

    fun getDados() : List<Int>{
      return listOf<Int>(dices_images[dado1], dices_images[dado2])
    }


}