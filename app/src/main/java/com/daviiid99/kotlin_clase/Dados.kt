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

        var result_1 = 0
        var result_2 = 0

        if (dado1 == 0){
            result_1 = 1
        } else if (dado1 == 1){
            result_1 = 2
        } else if (dado1 == 2){
            result_1 = 3
        } else if (dado1 == 3){
            result_1 = 4
        } else if (dado1 == 4){
            result_1 = 5
        } else if (dado1 == 5){
            result_1 = 6
        }

        if (dado2 == 0){
            result_2 = 1
        } else if (dado2 == 1){
            result_2 = 2
        } else if (dado2 == 2){
            result_2 = 3
        } else if (dado2 == 3){
            result_2 = 4
        } else if (dado2 == 4){
            result_2 = 5
        } else if (dado2 == 5){
            result_2 = 6
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