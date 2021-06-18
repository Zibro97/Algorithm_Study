//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var N = Integer.parseInt(br.readLine())

    for(i in 1..N){
        val st = StringTokenizer(br.readLine()," ")
        bw.write("Case #${i}: ${(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))}\n")
    }
    br.close()

    bw.flush()
    bw.close()
}
