import java.io.BufferedReader
import java.io.InputStreamReader

private val dp = IntArray(1000001){0}
fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    dp[1] = 1
    dp[2] = 2
    for(i in 3..n) dp[i] = (dp[i-1]+dp[i-2]) % 15746
    print(dp[n])
    close()
}
