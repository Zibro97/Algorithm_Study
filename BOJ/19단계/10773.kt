import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val stack = Stack<Int>()

    repeat(readLine().toInt()){
        when(val data = readLine().toInt()){
            0 -> stack.pop()
            else -> stack.push(data)
        }
    }
    print(stack.sum())
}
