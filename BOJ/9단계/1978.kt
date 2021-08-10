import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal
import java.util.*
import kotlin.math.round
import kotlin.math.sqrt

fun main(){
    val br = BufferedReader(InputStreamReader((System.`in`)))
    val n = br.readLine().toInt() // 필요없는 변수(숫자의 개수)
    val input = StringTokenizer(br.readLine()) // 숫자들
    var sum = 0

    for(i in input){
        val a = i.toString()
        sum += function(a)
    }
    print("${sum}")
}
fun function(i:String):Int {
    val n = i.toInt()
    if(n==1){
        return 0
    }
    else{
        if(n!=2&&n%2==0){//짝수이면 소수 아님
            return 0
        }
        else if(n ==2){ //짝수중에서 2는 유일한 소수
            return 1
        }else{ //홀수이면 n의 제곱근까지 나눠서 나누어 떨어지는지 체크
            for(j in 3..sqrt(n.toDouble()).toInt() step 2){
                if(n %j ==0){
                    return 0
                }
            }
            return 1
        }
    }
}
