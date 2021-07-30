import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    print("${hs(n)}")
}

fun hs(n: Int): Int {
    var cnt = 0
    var arr = IntArray(3)
    var w = 0
    for(i in 1..n){
        if(i in 1..99) cnt = i
        else if( i ==1000) break
        else{
            w = 0
            var temp = i
            while(temp >0){
                arr[w] = temp % 10
                temp /= 10
                w++
            }
            if(arr[0] - arr[1] ==arr[1] - arr[2]) cnt++
        }
    }
    return cnt
}
