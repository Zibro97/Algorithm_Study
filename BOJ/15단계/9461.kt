import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val dp = LongArray(101){1}
    for(i in 4..100) dp[i] = (dp[i-3]+dp[i-2])
    for(j in 1..readLine().toInt()) println(dp[readLine().toInt()])
    close()
}
