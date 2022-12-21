package kotlinAlgorithm

import java.io.BufferedReader
import java.io.InputStreamReader

// 백준 2292번
fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val hNumber = this.readLine().toInt() // 내가 찾는 방 번호
    var count = 1 // 6번 ++ 되면 count++
    var roomNumber = 1

    if (hNumber == 1) println(1)
    else{
        while (roomNumber < hNumber){
            roomNumber += (count * 6)
            count++
        }
        println(count)
    }


}