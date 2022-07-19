import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val stack = Stack<Int>()

    for(i in 1..readLine().toInt()){
        val command = readLine().split(" ")
        when(command[0]){
            "push" -> stack.push(command[1].toInt())
            "pop" ->{
                if(stack.isEmpty()) println(-1)
                else println(stack.pop())
            }
            "top" -> {
                if(stack.isEmpty()) println(-1)
                else println(stack.peek())
            }
            "size" -> println(stack.size)
            "empty" -> {
                if(stack.isEmpty()) println(1)
                else println(0)
            }
        }
    }
}
