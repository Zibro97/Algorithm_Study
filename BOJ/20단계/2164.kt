import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val queue = ArrayDeque<Int>()

    repeat(readLine().toInt()) {
        queue.addLast(it+1)
    }
    while(queue.size > 1){
        queue.poll()
        queue.addLast(queue.poll())
    }
    print(queue.peek())
}
