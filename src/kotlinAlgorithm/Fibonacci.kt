package kotlinAlgorithm


// 백준 10870번 꼬리재귀를 이용한 피보나치 수열
tailrec fun fibonacci(n: Int, first: Int, second: Int): Int {
    return if (n == 0) first else {
        fibonacci(n-1, second, first + second)
    }
}


fun main(){
    val n = readln()!!.toInt()
    val a = ("0").toInt()
    val b = ("1").toInt()
    println(fibonacci(n, a, b))
}

