package kotlinAlgorithm

// 백준 10872번 꼬리재귀를 이용한 팩토리얼
tailrec fun factorial(n: Int) : Int{
    return if (n == 1) 1 else{
        n * factorial(n - 1)
    }


}

fun main(){
    val n = readln()!!.toInt()
    println(factorial(n))

}