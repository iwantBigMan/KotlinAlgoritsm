package kotlinAlgorithm


import java.util.Scanner
// 백준 10757번
fun main(): Unit = with(Scanner(System.`in`)){
    val a = this.nextBigInteger()
    val b = this.nextBigInteger()
    val result = a.add(b)
    println(result)

}

