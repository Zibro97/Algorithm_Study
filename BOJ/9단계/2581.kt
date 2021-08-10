import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal
import java.util.*
import kotlin.math.round
import kotlin.math.sqrt

fun main(){
    val br = BufferedReader(InputStreamReader((System.`in`)))
    val m = br.readLine().toInt() //m이상
    val n = br.readLine().toInt() //n이하
    var arr = arrayListOf<Int>()

    for(i in m..n){
        if(function(i)==0){//소수아니면 다음으로 넘어감
            continue
        }else{
            arr.add(function(i)) //소수이면 배열에 담음
        }
    }
    if(arr.isEmpty()){ //m이상 n이하에서 소수가 없으면 -1 출력
        print(-1)
    }else{ //m이상 n이하의 소수들의 합계와 최솟값 출력
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
