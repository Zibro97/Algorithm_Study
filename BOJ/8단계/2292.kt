import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().toInt()
    print("${bee(input)}")

}
private fun bee(n:Int):Int{
    var num = 2
    var room = 1
    if(n == 1){ //1이면 무조건 1
         return room
    }
    while (num<=n){
        num += 6*room++
    }
    return room
}
