package kotlinTest.stringHandling

class Solution {
    fun solution(s: String): Int {
        val nums = arrayOf("one","two","three","four","five","six", "seven","eight","nine")
        var str = s
        for (i in nums.indices){
            str = str.replace(nums[i], i.toString())
        }
        return str.toInt()
        println(str)
    }
}

fun main(){
    val out = Solution()
    println(out)
}

