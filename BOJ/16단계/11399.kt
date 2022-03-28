import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var t = readLine().toInt()
    val time = readLine().split(" ").map { it.toInt() }.sorted()
    var result = 0
    time.forEach {
        result += it*(t--)
    }

    print("$result")
    close()
}
