//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
import java.util.*

fun main(){
    val sc: Scanner = Scanner(System.`in`)
    var count = sc.nextInt()

    for(i in 1..count){
        var flag = count-i
        for(x in 1..flag){
            print(" ")
        }
        for(j in 1..i){
            print("*")
        }
        println()
    }
    sc.close()
}
