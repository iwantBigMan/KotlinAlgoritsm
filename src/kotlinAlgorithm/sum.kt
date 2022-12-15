package kotlinAlgorithm

import java.io.BufferedReader
import java.io.InputStreamReader

// 백준 11720
fun main()= with(BufferedReader(InputStreamReader(System.`in`))) {
    val c = readLine().toInt()
    var sum = 0
    val number = readLine()
    number.forEach { sum += it.toString().toInt() }
    println(sum)
}
