import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val dp = mutableListOf<MutableList<Int>>()
    repeat(n){
        dp.add(readLine().split(" ").map { it.toInt()}.toMutableList())
    }
    for(i in 1 until n){
        for(j in 0..i){
            when(j){
                0-> dp[i][j] += dp[i-1][j]
                i-> dp[i][j] += dp[i-1][j-1]
                else-> dp[i][j] += max(dp[i-1][j-1],dp[i-1][j])
            }
        }
    }
    print("${dp[n-1].maxOf{ it }}")
    close()
}
