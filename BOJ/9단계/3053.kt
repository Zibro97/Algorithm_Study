import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val x = br.readLine().toDouble()
    val pie = 3.14159265359

    println("${x.pow(2)*pie}")//유클리드 기하학
    print("${2*x.pow(2)}")//택시 기하학

}
