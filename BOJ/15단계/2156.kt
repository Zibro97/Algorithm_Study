import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val dp = IntArray(n+2){0}
    val grape = IntArray(n+2){0}
    repeat(n){
        grape[it+1] = readLine().toInt()
    }
    dp[1]= grape[1]
    dp[2] = grape[1]+grape[2]
    for(i in 3..n){
        dp[i] = max(max(dp[i-1],(grape[i]+dp[i-2])),(grape[i]+grape[i-1]+dp[i-3]))
    }
    println(dp[n])
    close()
}
