import kotlin.math.pow
import kotlin.math.sqrt

//앵그리 창영
fun main() {
    //성냥의 개수 N
    //박스의 가로 크기 W
    //박스의 세로 크기 H
    val (n,w,h) = readLine()!!.split(' ').map{ it.toInt() }
    val max = sqrt(w.toDouble().pow(2) + h.toDouble().pow(2))

    repeat(n){
        if(readLine()!!.toInt() <= max) println("DA")
        else println("NE")
    }
}
