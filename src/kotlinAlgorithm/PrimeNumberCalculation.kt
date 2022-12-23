package kotlinAlgorithm


import java.util.Scanner

// 백준 소수 구하기 1978

fun main() = with(Scanner(System.`in`)) {
    val number = this.nextInt()
    var count = 0
    var primeNumber = 0

    for(i in 0 until number){
        val prime = this.nextInt()
        for (j in 2..prime){
            if (prime % j == 0){
                count++
            }
        }
        if (count == 1){
            primeNumber++
        }
        count = 0
    }
    println(primeNumber)
}