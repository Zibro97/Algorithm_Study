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
        var A = (Integer.parseInt(st.nextToken()))
        var B = (Integer.parseInt(st.nextToken()))
        bw.write("Case #${i}: ${A} + ${B} = ${A+B}\n")
    }
    br.close()

    bw.flush()
    bw.close()
}
