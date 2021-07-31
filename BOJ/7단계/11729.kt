import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val numArr = br.readLine()
    var sum = 0

    for (i in 0 until n){
        sum += (numArr[i]-'0') //numArr 문자열 내의 숫자들은 숫자가 아닌 아스키코드로 인식되므로 아스키코드를 빼줘서 연산
    }//0은 아스키 코드로 48

    print("${sum}")

}
