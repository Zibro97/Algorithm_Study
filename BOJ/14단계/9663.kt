import kotlin.math.abs

private val bw = System.out.bufferedWriter()
private val br = System.`in`.bufferedReader()
private var n = 0
private var sum = 0
private var col = IntArray(15){0} //체스판

fun main(){
    n = br.readLine().toInt() //input
    dfs(0)
    bw.write("$sum")
    bw.flush()
    bw.close()
    br.close()
}

fun dfs(x: Int) {
    if(x == n) sum++
    else {
        for(i in 0 until n){
            col[x] =i //x번째 열의 i번째 행 
            if(check(x))
                dfs(x+1)
        }
    }
}
fun check(level:Int) : Boolean{
    for(i in 0 until level){
        if (col[i] == col[level]||abs(col[level] - col[i]) == level - i) //같은 행에 있거나 대각선에 있으면false
            return false
    }
    return true
}
