//흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
//첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    var x = sc.nextInt()
    var y = sc.nextInt()
    
    if(x > 0 && y > 0){
        print("1")
    }else if(x<0&&y>0){
        print("2")
    }else if(x<0&&y<0){
        print("3")
    }else if(x>0&&y<0){
         print("4")
    }
}
