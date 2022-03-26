import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var (n,k) = readLine().split(" ").map { it.toInt() }
    val wallet:IntArray = IntArray(n){readLine().toInt()}.sortedArrayDescending()
    var cnt = 0

    wallet.forEach {
        if(k/it !=0) cnt+=k/it
        k %= it
    }
    println("$cnt")
    close()
}
