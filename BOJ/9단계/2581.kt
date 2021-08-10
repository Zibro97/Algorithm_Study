import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal
import java.util.*
import kotlin.math.round
import kotlin.math.sqrt

fun main(){
    val br = BufferedReader(InputStreamReader((System.`in`)))
    val n = br.readLine().toInt() //m이상
    val m = br.readLine().toInt() //n이하
    var arr = arrayListOf<Int>()

    for(i in n..m){
        if(function(i)==0){
            continue
        }else{
            arr.add(function(i))
        }
    }
    if(arr.isEmpty()){
        print(-1)
    }else{
        println("${arr.sum()}")
        print("${arr.minOrNull()}")
    }
}
fun function(i:Int):Int {
    if(i==1){
        return 0
    }
    else{
        if(i!=2&&i%2==0){//짝수이면 소수 아님
            return 0
        }
        else if(i ==2){ //짝수중에서 2는 유일한 소수
            return i
        }else{ //홀수이면 n의 제곱근까지 나눠서 나누어 떨어지는지 체크
            for(j in 3..sqrt(i.toDouble()).toInt() step 2){
                if(i %j ==0){
                    return 0
                }
            }
            return i
        }
    }
}
