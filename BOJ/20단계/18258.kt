import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val queue = ArrayDeque<Int>()
    val sb = StringBuilder()

    repeat(readLine().toInt()){
        val data= readLine().split(" ")
        when(data[0]){
            "push" -> queue.add(data[1].toInt())
            "pop" ->{
                if(queue.isEmpty()) sb.append(-1).append("\n")
                else sb.append(queue.poll()).append("\n")
            }
            "size" -> sb.append(queue.size).append("\n")
            "empty" -> {
                if(queue.isEmpty()) sb.append(1).append("\n")
                else sb.append(0).append("\n")
            }
            "front" -> {
                if(queue.isEmpty()) sb.append(-1).append("\n")
                else sb.append(queue.peek()).append("\n")
            }
            "back" -> {
                if(queue.isEmpty()) sb.append(-1).append("\n")
                else sb.append(queue.peekLast()).append("\n")
            }
        }
    }
    print(sb)
}
