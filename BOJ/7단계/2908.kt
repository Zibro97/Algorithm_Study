import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    val a = input.nextToken().reversed().toInt()
    val b = input.nextToken().reversed().toInt()

    if(a>b){
        print(a)
    }else{
        print(b)
    }
}
