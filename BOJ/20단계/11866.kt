import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val (n,k) = readLine().split(" ").map{ it.toInt() }
    val sb = StringBuilder().apply { append("<") }
    val queue = LinkedList((1..n).toList())
    var cnt = k-1

    while(queue.size != 1) {
        sb.append("${queue[cnt]}, ")
        queue.removeAt(cnt)
        cnt = (cnt + k-1) % queue.size
    }
    sb.append("${queue.last()}>")
    print(sb)
}
