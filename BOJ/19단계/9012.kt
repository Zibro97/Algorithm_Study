import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    loop@for(i in 0 until readLine().toInt()){
        val stack = Stack<Char>()
        for(data in readLine()){
            when(data) {
                '(' -> stack.push(data)
                else ->{
                    if(stack.isEmpty()) {
                        println("NO")
                        continue@loop
                    }
                    else stack.pop()
                }
            }
        }
        if(stack.isEmpty()) println("YES")
        else println("NO")
    }
}
