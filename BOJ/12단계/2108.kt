import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.roundToInt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val arr = MutableList(n){ readLine().toInt() }.sorted()

    println("${arr.average().roundToInt()}")
    println("${arr[n/2]}")
    arr.groupingBy { it }.eachCount().toList().sortedByDescending { it.second }.apply {
        when{
            size == 1->println(get(0).first)
            get(0).second == get(1).second -> println(get(1).first)
            else -> println(get(0).first)
        }
    }
    println("${arr[n-1] - arr[0]}")

    close()
}
