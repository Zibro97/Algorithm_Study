//백트래킹 : 해를 찾는 도중 해가 아니어서 막히면, 되돌아가서 다시 해를 찾아가는 기법
//dfs를 이용해 모든 수열을 탐색하는데 이미 방문한 숫자가 나오는 경우 제외하기 때문에 백트래킹 기법
import java.util.*

val br = System.`in`.bufferedReader()
val bw = System.out.bufferedWriter()
var n = 0
var m = 0
val check = BooleanArray(10) { false }
fun printString(sequence:String){
    for(element in sequence){
        bw.write("$element ")
    }
    bw.write("\n")
}
private fun dfs(sequence:String){
    if(sequence.length >= m){
        printString(sequence)
        return
    }
    for(i in 1..n){
        if(check[i]) continue
        check[i] = true
        dfs(sequence + "$i")
        check[i] = false
    }
}
fun main(){
    val input  = StringTokenizer(br.readLine(), " ")
    n = input.nextToken().toInt() //n까지
    m = input.nextToken().toInt() //길이 m의 수열
    
    dfs("")
    br.close()
    bw.flush()
    bw.close()
}
