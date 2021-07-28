import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {

    val n = readLine().toInt()
    val tmp = readLine().split(" ")

    val array = DoubleArray(n)
    for(i in 0 until n){
        array[i] = tmp[i].toDouble()
    }
    val max = array.maxOrNull()
//    print(max)
    for(i in 0 until n){
        array[i] = array[i]/ max!! *100
    }
    val avg = array.average()
    print("${avg}")
}
