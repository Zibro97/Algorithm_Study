//3차원 배열 (20넘으면 필요 없음)
private val dp = Array(21){Array(21){Array(21){-1} } }
fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    dp[0][0][0] = 1

    while (true){
        val (a,b,c) = readLine().split(" ").map { it.toInt() }
        if(a ==-1 && b == -1 && c==-1) break
        println("w($a, $b, $c) = ${w(a,b,c)}")
    }
    close()
}
//dp 배열에 저장한 후 불러옴
fun w(a:Int,b:Int,c:Int): Int{
    if (a <=0 || b<=0 || c<=0) return 1
    if(a > 20 || b>20 || c > 20) return w(20,20,20)
    if(dp[a][b][c] ==-1) dp[a][b][c] = w(a -1, b, c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1)

    return dp[a][b][c]
}
