package kotlinAlgorithm

// 숫자 문자열과 영단어 치환하기


class Solution {
    fun solution(s: String): Int {
        val nums = mapOf("one" to "1","two" to "2","three" to "3","four" to "4","five" to "5",
          "six" to "6", "seven" to "7","eight" to "8","nine" to "9")
        val nums2 = listOf("zero", "one", "two", "three", "four", "five", "six", "seven","eight", "nine")
        var str = s

        for (i in 0..nums2.size){
            str = str.replace(nums2[i],i.toString())
        }

        return str.toInt()
    }
}



