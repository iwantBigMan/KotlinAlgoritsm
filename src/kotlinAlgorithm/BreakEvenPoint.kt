package kotlinAlgorithm

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val st = StringTokenizer(this.readLine())

    val fixedCost = st.nextToken().toInt()
    val variableCost = st.nextToken().toInt()
    val productPrice = st.nextToken().toInt()
    var productCnt = 1

    productCnt = if (variableCost >= productPrice) -1 else (fixedCost/(productPrice - variableCost) + 1)
    println(productCnt)

}