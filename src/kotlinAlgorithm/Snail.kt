package kotlinAlgorithm

import java.util.Scanner
// 백준 2869번 달팽이는 올라가고 싶다
// 낮에는 dayL 만큼 올라가고 밤에는 nightL만큼 미끄러진다.
// 도착점 destination 만큼 올라가려면 며칠이 걸리는 지
fun main() = with(Scanner(System.`in`)){
    val dayL = nextInt() // up
    val nightL = nextInt() // down
    val destination = nextInt() //length
    var final = (destination - nightL) / (dayL - nightL) // 만약 2 1 5 가 입력값이면 4일이 걸리는데  destination/
                                                        // (dayL - nightL) 이렇게 식을 만들면 5가 나오게 되면서 조건에 부합하지 않는다.


    if ((destination - nightL) % (dayL - nightL) != 0) final++

    println(final)
    }


