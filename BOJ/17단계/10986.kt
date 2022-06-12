import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val (n,m) = readLine().split(" ").map{ it.toInt() }
    var sum = 0
    val count = LongArray(m)

    val st = StringTokenizer(readLine())
    repeat(n){
        sum += Integer.parseInt(st.nextToken()) % m
        count[sum%m]++
    }

    var ans : Long = count[0]
    repeat(m){
        ans += count[it] * (count[it] -1) / 2.toLong()
    }
    print(ans)

    close()
}
