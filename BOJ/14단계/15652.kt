import java.util.*

//백트래킹 : 해를 찾는 도중 해가 아니어서 막히면, 되돌아가서 다시 해를 찾아가는 기법
//dfs를 이용해 모든 수열을 탐색하는데 이미 방문한 숫자가 나오는 경우 제외하기 때문에 백트래킹 기법
private val bw = System.out.bufferedWriter()
private val br = System.`in`.bufferedReader()
private var array = intArrayOf()
private var n =0
private var m =0

fun main(){
    val input = StringTokenizer(readLine()!!)
    n = input.nextToken().toInt()
    m = input.nextToken().toInt()

    array = IntArray(m)
    dfs(1,0)
    bw.flush()
    bw.close()
    br.close()
}
private fun dfs(current:Int, depth:Int){
    if(depth == m) {
        for(i in array) bw.write("$i ")
        bw.newLine()
        return
    }
    for(j in current..n) {
        array[depth] = j
        dfs(j, depth + 1)
    }
}
