import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val a = IntArray(n)
    val dp = IntArray(n)
    repeat(n){
        a[it] = readLine().toInt()
    }
    dp[0] = a[0]
    dp[1] = a[0] + a[1]
    dp[2] = max(a[0]+a[2],a[1] + a[2])
    for(i in 3 until n){
        dp[i] = max(a[i] + dp[i-2],a[i]+a[i-1]+dp[i-3])
    }
    print("${dp[n-1]}")
    close()
}
