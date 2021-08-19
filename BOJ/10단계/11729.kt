import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow
import kotlin.math.roundToInt

val bw =BufferedWriter(OutputStreamWriter(System.out))
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()//원판 개수
    bw.write("${(2.0.pow(n)-1).roundToInt()}\n")
    hanoi(n,1,2,3)
    br.close()
    bw.flush()
    bw.close()
}

fun hanoi(n: Int,from:Int,by:Int,to:Int){
    if(n == 1){
        bw.write("$from $to\n")
    }else{
        hanoi(n-1,from,to,by)
        bw.write("$from $to\n")
        hanoi(n-1,by,from,to)
    }
}
