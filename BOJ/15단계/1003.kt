import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val testcase = readLine().toInt()

    //testcase 만큼 반복
    repeat(testcase){
        val n = readLine().toInt()
        println("${fibo(n-1)} ${fibo(n)}")
    }
}
fun fibo(n:Int): Int{
    //0이면 0
    if(n ==0 ) return 0
    //1이면 1
    if(n==1) return 1
    //2이상 숫자는 앞 두개의 숫자를 더한 값 리턴
    var a =0
    var b =1
    var temp =0
    for(i in 2..n){
        temp = a
        a = b
        b += temp
    }
    return b
}
