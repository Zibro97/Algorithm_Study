import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val dp = Array(n+1){IntArray(10)}
    dp[1][0] = 0
    for(i in 1..9){
        dp[1][i] = 1
    }
    for(i in 2 ..n){
        for(j in 0..9){
            when(j){
                0 -> dp[i][j] = dp[i-1][1]
                9 -> dp[i][j] = dp[i-1][8]
                else -> dp[i][j] = (dp[i-1][j+1] + dp[i-1][j-1]) % 1000000000
            }
        }
    }
    var sum = 0L
    for (i in 0 until 10){
        sum += dp[n][i]
    }
    println(sum%1000000000)
    close()
}
