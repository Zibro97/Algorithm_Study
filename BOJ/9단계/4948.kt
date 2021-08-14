import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main(){
    val br = BufferedReader(InputStreamReader((System.`in`)))
    while (true){
        var sum = 0
        val testCase = br.readLine().toInt()
        if(testCase ==0){
            break
        }else{
            for(i in testCase+1..(testCase*2)){//테스트 케이스 n보다 크고, 2n보다 작거나 같은 소수의 개수
                sum+=function(i)
            }
            println("${sum}")
        }
    }
}
private fun function(i:Int):Int { //소수 찾는 함수
    if(i==1){
        return 0
    }
    else{
        if(i!=2&&i%2==0){//짝수이면 소수 아님
            return 0
        }
        else if(i ==2){ //짝수중에서 2는 유일한 소수
            return 1
        }else{ //홀수이면 n의 제곱근까지 나눠서 나누어 떨어지는지 체크
            for(j in 3..sqrt(i.toDouble()).toInt() step 2){
                if(i %j ==0){
                    return 0
                }
            }
            return 1
        }
    }
}
