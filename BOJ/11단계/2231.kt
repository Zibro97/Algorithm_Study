import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw =BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    br.close()
    var cnt = 1 // n의 자릿수
    var m = n
    while (m>=9){
        m /= 10
        ++cnt
    }
    val find = n - 9*cnt //256의 경우 3자리 수라면 각 자리수가 가질 수 있는 최대 값 9를 곱하면 3x9 27이 되므로 검사를 시작할 수치는 229부터
    var sum = 0
    for(i in find..n){ //find부터 n까지 수를 검사
        sum = i.toString().map {
            it.toInt() - '0'.toInt()
        }.sum() // 각 자리수의 합
        sum += i
        if ( n == sum){
            bw.write("$i")
            break
        }else if(i == n){
            bw.write("0")
        }
    }
    bw.flush()
    bw.close()
}
