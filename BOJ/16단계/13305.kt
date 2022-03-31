import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Long.MAX_VALUE
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    //도시의 개수
    val n = readLine().toInt()
    //도로의 길이 Array
    val roadArr = readLine().split(" ").map { it.toLong() }
    //주유소 가격 Array
    val gasArr = readLine().split(" ").map{it.toLong()}

    var foo = MAX_VALUE
    var sum = 0L

    for(i in 0 until n-1){
        foo = min(gasArr[i],foo)
        sum+=foo * roadArr[i]
    }

    print("$sum")
    close()
}
