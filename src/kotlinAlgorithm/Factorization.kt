package kotlinAlgorithm

import java.lang.StringBuilder

fun main(){
    var number = readln().toInt()
    val sb = StringBuilder()
    var prime = 2

   for (i in 2..number){
        if (number % prime == 0){
            sb.append(prime).append("\n")
            number /= prime
        }else{
            prime++
        }
    }
    println(sb)
}