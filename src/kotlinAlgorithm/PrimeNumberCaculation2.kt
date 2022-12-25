package kotlinAlgorithm

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Scanner

// 백준 소수 구하기 2581

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val minNumber = this.readLine().toInt()
    val maxNumber = this.readLine().toInt()
    var minPrime = 0
    var sumPrime = 0
    val primeNumber = Array(maxNumber + 1) {true}

    primeNumber[0] = false
    primeNumber[1] = false // 0과 1은 소수가 아님

    for (i in 2..maxNumber){ // 소수의 배수는 소수가 아니므로 배제
        if (primeNumber[i]){
            for (j in (2 * i)..maxNumber step i){
                primeNumber[j] = false
            }
        }
    }
    for (i in minNumber..maxNumber){
        if (primeNumber[i]){
            if (minPrime == 0){
                minPrime = i
            }
            sumPrime += i
        }
    }
    if (minPrime == 0){
        println(-1)
    }
    else{
        println(sumPrime)
        println(minPrime)
    }
}