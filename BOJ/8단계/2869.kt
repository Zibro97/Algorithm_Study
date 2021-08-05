//내가 풀어서 시간초과 된 문제
//시간 0.25초 제한
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
// 정답
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())

    val a = input.nextToken().toInt()//낮에 A미터 올라감
    val b = input.nextToken().toInt()//밤에 B미터 미끄러짐
    val move = a-b //마지막 날을 제외한 하루에 움직이는 거리
    var v = input.nextToken().toInt()//v미터인 나무막대
    val remain = v - a //
    
    if(remain % move == 0){
        print("${remain/move+1}")
    }else{
        print("${remain/move+2}")
    }

}
