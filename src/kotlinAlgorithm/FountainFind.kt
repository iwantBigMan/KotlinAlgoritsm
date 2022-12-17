package kotlinAlgorithm

import java.io.BufferedReader
import java.io.InputStreamReader

// 백준 1193 분수 찾기

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = this.readLine().toInt()

    var i = 0
    var sum = 0
    while (i + sum < n) {
        sum += i++
    }

    var a = if (i % 2 == 0) n - sum else i + 1 - (n - sum)
    var b = i + 1 - a

    print("$a/$b")
}



