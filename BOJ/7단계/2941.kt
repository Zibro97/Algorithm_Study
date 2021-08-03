import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var gm = br.readLine()
    val arr = arrayOf("c=","c-","dz=","d-","lj","nj","s=","z=")

    arr.forEach {
        if(gm.contains(it)){
            gm = gm.replace(it," ")
        }
    }
    print("${gm.length}")

}
