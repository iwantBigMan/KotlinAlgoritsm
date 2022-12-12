package kotlinAlgorithm


import java.util.Scanner
// 백준 10757번
fun main() = with(Scanner(System.`in`)){
    val a = this.nextBigInteger()
    val b = this.nextBigInteger()
    val result = a.plus(b)
    println(result)

}

