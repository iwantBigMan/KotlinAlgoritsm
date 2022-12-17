package kotlinAlgorithm

import java.util.Scanner

// 백준 1193 분수 찾기

fun main() = with(Scanner(System.`in`)){
    val findNumber = this.nextInt()
    var sum = 1 // 분모 분자 합
    var tmp = 0 // 마지막 순서

    while (tmp < findNumber){
        tmp += sum
        sum++
    }

    if (sum % 2 == 0){
        val molecule = (tmp - findNumber + 1)
        val denominator = sum - molecule
        println("$molecule / $denominator")
    }
    else {
        val  denominator = (tmp - findNumber + 1)
        val molecule= sum - denominator
        println("$molecule / $denominator")
    }
}
