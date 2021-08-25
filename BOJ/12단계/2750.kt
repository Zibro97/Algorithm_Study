import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val testCase = br.readLine().toInt()
    val arr = arrayOfNulls<Int>(testCase)
    for(i in 0 until testCase){
        arr[i] = br.readLine().toInt()
    }
    arr.sort()
    arr.forEach {
        bw.write("$it\n")
    }
    bw.flush()
    bw.close()
    br.close()
}
