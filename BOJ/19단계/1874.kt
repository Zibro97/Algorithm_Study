import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

//입력값대로 수열 만드는 문제
fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val stack = Stack<Int>()
    var idx = 1
    val answer = StringBuffer()

    repeat(readLine().toInt()) {
        val data = readLine().toInt()
        while(idx <= data){
            stack.add(idx)
            idx++
            answer.append("+\n")
        }
        if(stack.isNotEmpty() && stack.peek() != data){
            println("NO")
            return
        } else if(stack.isNotEmpty()){
            stack.pop()
            answer.append("-\n")
        }
    }
    print(answer)
}
