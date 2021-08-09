import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal
import java.util.*
import kotlin.math.round
import kotlin.math.sqrt

fun main(){
    val br = BufferedReader(InputStreamReader((System.`in`)))
    val testCase = br.readLine().toInt()

    for(i in 1..testCase){
        val input = StringTokenizer(br.readLine())
        val x = input.nextToken().toInt()
        val y = input.nextToken().toInt()
        var distance = y-x
        var zegop = sqrt(distance.toDouble())
        var roundUp = round(zegop)

        if(distance <= 3){
            println("${distance}")
        }else if(zegop > roundUp){
            println("${roundUp.toInt()*2}")
        }else{
            println("${roundUp.toInt()*2-1}")
        }
    }
    br.close()
}
