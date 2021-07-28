import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {

    val a = readLine().toInt()
    val b = readLine().toInt()
    val c = readLine().toInt()

    var result = a*b*c
//    print(result)

    val array = Array(10){0}
    while (result>0){
        array[result%10] += 1
        result /= 10
    }

    array.forEach {
        print("$it\n")
    }
}
  
