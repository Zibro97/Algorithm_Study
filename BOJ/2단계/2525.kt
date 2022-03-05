import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var(a,b)=readLine().split(' ').map{it.toInt()}
    var c = readLine().toInt()

    b += c
    a += b / 60
    b %= 60
    a %= 24
    print("$a $b")
}
