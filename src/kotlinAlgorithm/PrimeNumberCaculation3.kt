package kotlinAlgorithm

import java.lang.StringBuilder


fun main() {
    val number = readln().split(" ")
    val min = number[0].toInt()
    val max = number[1].toInt()
    var sb = StringBuilder()

    val primeNumber = Array(max + 1) {true}

    primeNumber[0] = false
    primeNumber[1] = false // 0과 1은 소수가 아님

    for (i in 2..max){ // 소수의 배수는 소수가 아니므로 배제
        if (primeNumber[i]){
            for (j in (2 * i)..max step i){
                primeNumber[j] = false
            }
        }
    }
    for (i in min..max){
        if (primeNumber[i]){
            sb.append(i).append("\n")
        }

    }
    println(sb)



}
