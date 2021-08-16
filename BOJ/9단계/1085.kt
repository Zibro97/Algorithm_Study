import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    val x = input.nextToken().toInt()
    val y = input.nextToken().toInt()
    val w = input.nextToken().toInt()
    val h = input.nextToken().toInt()
    val xSub = w - x
    val ySub = h - y
    val minXY = min(x,y)
    val minSub = min(xSub,ySub)

    print("${min(minXY,minSub)}")
}

//다른 사람의 간단한 풀이
fun main() {
    println(readLine()!!.split(" ").map { it.toInt() }.let { (x, y, w, h) ->
        listOf(x, y, w - x, h - y).minOrNull()
    })
}
