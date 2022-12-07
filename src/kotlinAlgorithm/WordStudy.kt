package kotlinAlgorithm

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Scanner

fun main()= with(BufferedReader(InputStreamReader(System.`in`))){
    var str = this.readLine()
    val map = mutableMapOf<Char, Int>()

    str.forEach {
        val char = it.toUpperCase()
        if (map.containsKey(char)){
            map[char] = map[char]!!.plus(1)
        }
        else{
            map[char] = 1
        }
    }
    val max = map.maxByOrNull { it.value }
    if (map.filter { it.value == max!!.value }.count() > 1){
        println("?")
    }
    else
    {
        println(max!!.key)
    }


}