//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//방법 1(Scanner를 이용)
import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    
    while (sc.hasNextInt()){
        var a = sc.nextInt()
        var b = sc.nextInt()
        println(a+b)
    }
    sc.close()
}
