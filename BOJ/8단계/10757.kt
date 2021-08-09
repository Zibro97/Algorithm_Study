import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader((System.`in`)))
    val input = StringTokenizer(br.readLine())
    val a= input.nextToken().toBigDecimal()
    val b = input.nextToken().toBigDecimal()

    print(a+b)
}
