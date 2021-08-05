import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())

    val a = input.nextToken().toInt()//낮에 A미터 올라감
    val b = input.nextToken().toInt()//밤에 B미터 미끄러짐=
    var v = input.nextToken().toInt()//v미터인 나무막대
    var day = 0 //날짜
    var result = 0

    while (result < v){
        ++day
        result +=a
        if(result >= v){
            break
        }
        result -=b
    }

    print("${day}")

}
