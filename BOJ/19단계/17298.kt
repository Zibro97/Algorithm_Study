import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val stack = Stack<Int>()
    val answer = StringBuffer()
    val n = readLine().toInt()
    val arr = readLine().split(" ").map{ it.toInt() }.toMutableList()

    repeat(n){
        while(!stack.isEmpty() && arr[stack.peek()] < arr[it]){
            arr[stack.pop()] = arr[it]
        }
        stack.push(it)
    }

    while(!stack.isEmpty()){
        arr[stack.pop()] = -1
    }
    repeat(n) {
        answer.append(arr[it]).append(" ")
    }
    print(answer)

}
