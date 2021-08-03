import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val gm = StringTokenizer(br.readLine()).nextToken()
    var totalTime=0

    gm.forEach {
        when(it){
            'A','B','C' -> totalTime += 3
            'D','E','F' ->totalTime += 4
            'G','H','I' -> totalTime += 5
            'J','K','L' -> totalTime +=6
            'M','N','O' -> totalTime +=7
            'P','Q','R','S' -> totalTime +=8
            'T','U','V' -> totalTime += 9
            'W','X','Y','Z' -> totalTime +=10
            else -> totalTime += 0
        }
    }
    print("${totalTime}")
}
