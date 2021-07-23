//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
import java.lang.StringBuilder
import java.util.*

fun main(){
    val sb = StringBuilder()
    while(true){
        var st = StringTokenizer(readLine()," ")

        var n = st.nextToken().toInt()
        var x = st.nextToken().toInt()
        if(n == 0 &&x == 0)
            break
        sb.append(n+x).append('\n')
    }
    println(sb)
}
