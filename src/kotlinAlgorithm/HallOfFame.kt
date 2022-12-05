package kotlinAlgorithm

import java.util.*

class HallOfFame {
    fun solution(k: Int, score: IntArray): IntArray {

        var answer: IntArray = IntArray(score.size)
        val minScore : PriorityQueue<Int> = PriorityQueue()

        for(i in score.indices){
            minScore.add(score[i])
            if(minScore.size > k) minScore.poll()
            answer[i] = minScore.peek()
        }
        return answer
    }
}

fun main(){
    val result = HallOfFame()
    result.solution(3, intArrayOf(10, 10, 10, 20, 20, 100, 100))
}

//class Solution {
//    fun solution(k: Int, score: IntArray): IntArray {
//        var answer: IntArray = intArrayOf()
//        return answer
//    }
//}