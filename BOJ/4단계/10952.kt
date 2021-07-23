//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
import java.lang.StringBuilder
import java.util.*

fun main(){
    val sb = StringBuilder()
    do{
        val br = System.`in`.bufferedReader()
        var st = StringTokenizer(br.readLine()," ")

        var n = st.nextToken().toInt()
        var x = st.nextToken().toInt()

        sb.append(n+x).append('\n')
    }while (n+x !=0)
    println(sb)
}
  
