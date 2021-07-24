import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine()

    var a = 0
    var b = 0
    var temp =  0
    var count = 0
    var c= str.toInt()

    while (true) {

        a = c / 10
        b = c % 10
        temp = (a + b) % 10
        c =  b * 10 + temp
        count++
        if(c == str.toInt() ) break
    }
    br.close()
    print(count)
}
