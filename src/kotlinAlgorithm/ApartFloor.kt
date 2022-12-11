package kotlinAlgorithm

import java.util.Scanner

// 백준 2775번
fun main() = with(Scanner(System.`in`)){
    val c = this.nextInt()
    var apartFloor = Array(15){Array(15){0} }

    for (i in 0 until 15){
        for (j in 0 until 15){
            if ( i == 0 || j == 0) apartFloor[i][j] = j+1
            else {
                apartFloor[i][j] = apartFloor[i - 1][j] + apartFloor[i][j-1]
            }
        }
    }

    for (i in 0 until c){
        val k = this.nextInt()
        val n = this.nextInt()
        println(apartFloor[k][n-1])
    }
}