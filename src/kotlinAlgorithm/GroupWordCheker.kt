package kotlinAlgorithm

import java.io.BufferedReader
import java.io.InputStreamReader


fun main()= with (BufferedReader(InputStreamReader(System.`in`))) {
    var result = 0

    repeat(readLine().toInt()){
        val wordGroup = mutableSetOf<Char>()
        val str = readLine()
        var prev = ' '
        var check = false

        for (i in str){
            if (prev != i){
                if (!wordGroup.add(i)){
                    check = true
                    break

                }
            }
            prev = i

        }
        if (!check){
            result++
        }


    }
    println(result)




}

