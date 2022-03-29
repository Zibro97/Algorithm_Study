import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val str = readLine().split("-")
    var answer = 0

    for(i in str.indices){
        val plus = str[i].split("+")
        plus.forEach{
            if(i==0) answer+= it.toInt()
            else answer -= it.toInt()
        }
    }

    print("$answer")
    close()
}
