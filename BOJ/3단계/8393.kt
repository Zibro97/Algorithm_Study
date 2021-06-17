import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    var sum = 0

    if(n>=1 && n<=10000){
        for (i in 1..n){
            sum += i
        }
        print("${sum}")
    }

}
