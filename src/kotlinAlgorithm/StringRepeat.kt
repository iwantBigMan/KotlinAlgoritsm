package kotlinAlgorithm

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val t = readLine().toInt()

    repeat(t) {
        val (re: String, str: String) = readLine().split(" ")
        var result = ""

        for (char in str) {
            repeat(re.toInt()) {
                result += char
            }
        }
        println(result)
    }
}