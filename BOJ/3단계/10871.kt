//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine()," ")

    val n = st.nextToken().toInt()
    val x = st.nextToken().toInt()

    val sb = StringBuilder()
    st = StringTokenizer(br.readLine()," ")

    for(i in 0 until n){
        val value = st.nextToken().toInt()
        if(value < x)sb.append(value).append(' ')
    }
    print(sb)
}
  
