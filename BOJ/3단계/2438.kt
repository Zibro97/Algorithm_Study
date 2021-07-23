//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
import java.util.*

fun main(){
    val sc: Scanner = Scanner(System.`in`)
    var count = sc.nextInt()

    for(i in 1..count){
        for(j in 1..i){
            print("*")
        }
        println()
    }
    sc.close()

}
