import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val dp = IntArray(n){ 1 }
    val sequence = readLine().split(" ").map { it.toInt() }

    for(i in 1 until n){
        for(j in 0 until i){
            if(sequence[i] > sequence[j]){
                dp[i] = max(dp[i],dp[j]+1)
            }
        }
    }
    println(dp.maxOrNull())
    close()
}
