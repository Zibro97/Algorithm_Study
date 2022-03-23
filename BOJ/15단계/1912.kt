import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val dp = IntArray(n){0}
    val sequence = readLine().split(" ").map { it.toInt() }

    dp[0] = sequence[0]
    for(i in 1 until n) dp[i] = max(sequence[i],dp[i-1] + sequence[i])
    
    println("${dp.maxOrNull()}")
    close()
}
