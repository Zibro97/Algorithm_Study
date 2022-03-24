import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val dp = IntArray(k+1){0}

    for(i in 0 until n){
        val (w,v) = readLine().split(" ").map { it.toInt() }
        for(j in k downTo w){
            dp[j] = max(dp[j],dp[j-w]+v)
        }
    }

    println("${dp[k]}")
    close()
}
