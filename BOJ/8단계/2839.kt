import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader((System.`in`)))
    var n = br.readLine().toInt() // n킬로그램 배달
    var cnt = 0
    
    while (true){
        if(n % 5 ==0){
            print("${n/5+cnt}")
            break
        }else if (n <=0){
            print(-1)
            break
        }
        n -= 3
        cnt ++
    }
}
