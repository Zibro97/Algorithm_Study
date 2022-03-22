import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val first = readLine().toCharArray()
    val second = readLine().toCharArray()
    val dp = Array(first.size+1){ IntArray(second.size+1) }

    for(i in 1 .. first.size) {
        for(j in 1 .. second.size){
            if(first[i-1] == second[j-1]){
                dp[i][j] = dp[i-1][j-1] +1
            }else{
                dp[i][j] = max(dp[i-1][j],dp[i][j-1])
            }
        }
    }
    println( dp[first.size][second.size])
    close()
}
