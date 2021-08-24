import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var cnt = 0
    var i = 0
    while (cnt<n){
        i++
        if(eschatology(i))
            cnt++
    }
    bw.write("$i")
    bw.flush()
    bw.close()
    br.close()
}

private fun eschatology(n: Int): Boolean {
    var num = n
    var count = 0
    while (num > 0) {
        if (num % 10 == 6) {
            count += 1
            if (count == 3)
                return true
        } else count = 0
        num /= 10
    }
    return false
}
