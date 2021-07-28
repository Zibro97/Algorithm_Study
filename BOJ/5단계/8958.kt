import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {

    val case = readLine().toInt()

    //임의의 횟수만큼 반복하고 싶을경우
    repeat (case){
        val score  = readLine().toString()
        var result = 0
        var count = 1
        score.forEach {
            if(it == 'O'){
                result += count++
            }else {
                count = 1
            }
        }
        println(result)
    }

}
