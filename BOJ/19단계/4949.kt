import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){

    loop@while(true){
        val data = readLine()
        if(data == ".") break
        val stack = Stack<Char>()
        for(c in data){
            if(c == '(' || c == '['){
                stack.push(c)
            } else if(c == ')'){
                if(stack.isNotEmpty() && stack.peek() == '('){
                    stack.pop()
                } else {
                    println("NO")
                    continue@loop
                }
            } else if(c == ']'){
                if(stack.isNotEmpty() && stack.peek() == '['){
                    stack.pop()
                } else {
                    println("NO")
                    continue@loop
                }
            }
        }
        if(stack.isEmpty()) println("YES")
        else println("NO")
    }
}
