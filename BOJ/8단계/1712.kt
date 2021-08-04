import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    val fc= input.nextToken().toInt()//고정비용
    val vc = input.nextToken().toInt()//가변비용
    val nc = input.nextToken().toInt() //노트북 한대 가격
    var cnt = 1 //판매량

    if(vc >= nc) {
        cnt = -1
    }else{
        cnt += fc /(nc-vc)
    }
    print("${cnt}")
}
