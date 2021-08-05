import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().toInt()

    var line = 0 // 대각선
    var sum = 0
    while (line+sum<input){
        sum += line++
    }

    var a = if(line%2==0) input - sum //대각선이 짝수일 경우 분자
            else line+1-(input-sum) // 대각선이 홀수 번째일 경우 분자
    var b = line + 1 -a //분모

    print("%d/%d".format(a, b))
}
