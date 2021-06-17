//자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    var N = sc.nextInt()

    if (N <= 100000){
        for(i in 1..N){
            println(i)
        }
    }
}
