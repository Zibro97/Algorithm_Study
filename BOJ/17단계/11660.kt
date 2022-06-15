import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val (n,m) = readLine().split(" ").map{ it.toInt() }
    val sum = Array(n+1){ IntArray(n+1) }

    for(i in 1..n){
        var temp = 0
        val line = readLine().split(" ").map{it.toInt()}
        for(j in 1..n){
            temp += line[j-1]
            sum[i][j] = sum[i-1][j]+temp
        }
    }
    repeat(m){
        val (x1,y1,x2,y2) = readLine().split(" ").map { it.toInt() }
        println("${sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1-1] + sum[x1 -1][y1-1]}")
    }

    close()
}
