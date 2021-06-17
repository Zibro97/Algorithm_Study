//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. (0<A,B<10)
import java.util.*

fun main(){
   val sc = Scanner(System.`in`)
    val c= sc.nextInt()
    var arr =IntArray(c) //int형 배열

    for(i in 0..c-1){
        var a = sc.nextInt()
        var b = sc.nextInt()
        arr[i] = a + b
    }
    sc.close()

    for(k in arr){
        System.out.println(k)
    }
}
