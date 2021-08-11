import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal
import java.util.*
import kotlin.math.round
import kotlin.math.sqrt

fun main(){
    val br = BufferedReader(InputStreamReader((System.`in`)))
    var n = br.readLine().toInt() //정수 입력
    var dev = 2
    while(n != 1){
        if(n % dev == 0){
            println("${dev}")
            n /= dev
        }else{
            dev++
        }
    }
}
