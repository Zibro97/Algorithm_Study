import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val dp = IntArray(n){1}
    val lines = Array(n){ Pair(0,0) }

    for(i in 0 until n){
        val (a,b) = readLine().split(" ").map { it.toInt() }
        lines[i] = Pair(a,b)
    }
    lines.sortBy { it.first }

    for(i in 0 until n) {
        for(j in 0 until i){
            if(lines[i].second > lines[j].second && dp[i] <= dp[j]){
                dp[i] = dp[j]+1
            }
        }
    }
    println( n - dp.maxOrNull()!!)
    close()
}
