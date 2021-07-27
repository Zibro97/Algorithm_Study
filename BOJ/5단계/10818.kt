import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sc = Scanner(System.`in`)
    val size = sc.nextInt()
    val list = ArrayList<Int>(size)

    for(i in 0 until size){
        var n = sc.nextInt()
        list.add(n)
    }

    //ArrayList의 최솟값, 최댓값 구하는 함수를 통해 간편하게 출력.
    //코틀린 버전에 따라 min(), minOrNull() 다르게 사용됨
    print("${list.minOrNull()} ${list.maxOrNull()}")
}
