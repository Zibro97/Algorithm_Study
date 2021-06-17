//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

import java.util.*
fun main(){

    val sc = Scanner(System.`in`)
    var N = sc.nextInt()

    if(N >= 1 && N <= 9){
        for (i in 1..9){
            println("${N} * ${i} = ${N*i}")
        }
    }
}
