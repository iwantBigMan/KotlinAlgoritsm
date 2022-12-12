package kotlinAlgorithm

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val dayL = nextInt()
    val nightL = nextInt()
    val destination = nextInt()
    var final = (destination - nightL) / (dayL - nightL)

    if ((destination - nightL) % (dayL - nightL) != 0) final++

    println(final)
    }


