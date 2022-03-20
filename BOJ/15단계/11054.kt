import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val dpRight = IntArray(n){ 1 }
    val dpLeft = IntArray(n){1}
    val sequence = readLine().split(" ").map { it.toInt() }

    for(i in 0 until n) {
        for(j in 0 until i){
            //정방향
            if(sequence[i] > sequence[j]){
                dpLeft[i] = max(dpLeft[i],dpLeft[j]+1)
            }
            //역방향
            if(sequence[n-1-i]>sequence[n-1-j]){
                dpRight[n-1-i] = max(dpRight[n-1-i], dpRight[n-1-j]+1)
            }
        }
    }
    println(dpLeft.zip(dpRight).maxOfOrNull { (x, y) -> x + y - 1 })
    close()
}
