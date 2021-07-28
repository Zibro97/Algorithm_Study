import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {

    val array = mutableSetOf<Int>()
    for(i in 0..9){
        var tmp = readLine().toInt()
        array.add(tmp%42)
    }
    print("${array.size}")
}
