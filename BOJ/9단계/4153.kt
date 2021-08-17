import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true){
        var input = br.readLine().split(" ").map { it.toInt() }.sorted()
        val x = input[0]
        val y = input[1]
        val z = input[2]

        if(x==0&&y==0&&z==0){
            break
        }
        if(z.toDouble().pow(2) == y.toDouble().pow(2) + x.toDouble().pow(2)){
            println("right")
        }else{
            println("wrong")
        }
    }

}
