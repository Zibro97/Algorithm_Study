import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader((System.`in`)))
    val testCase = br.readLine().toInt()

    for(i in 1..testCase){
        val input = StringTokenizer(br.readLine())
        val floor = input.nextToken().toInt()
        val rooms = input.nextToken().toInt()
        val order = input.nextToken().toInt()

        if(order % floor == 0 ){
            println("${floor*100+order/floor}")
        }else{
            println("${order%floor*100 + (order/floor+1)}")
        }

    }
}
