import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

//연산자 배열
private val operatorArr = IntArray(4)
//입력받은 숫자 배열
lateinit var numArr: IntArray
private var max = Integer.MIN_VALUE
private var min = Integer.MAX_VALUE


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    numArr = IntArray(size)
    val numStringTokenizer = StringTokenizer(readLine())
    for (i in numArr.indices) {
        numArr[i] = numStringTokenizer.nextToken().toInt()
    }
    val operatorStringTokenizer = StringTokenizer(readLine())
    for (i in operatorArr.indices) {
        operatorArr[i] = operatorStringTokenizer.nextToken().toInt()
    }
    dfs(numArr[0], 1)
    println(max)
    println(min)

    close()
}
//백트래킹 dfs
private fun dfs(num: Int, level: Int) {
    //단말노드라면 최대최소 구해서 리턴
    if (level == numArr.size) {
        max = Math.max(max, num)
        min = Math.min(min, num)
        return
    }
    for (i in operatorArr.indices) {
        if (operatorArr[i] > 0) {
            //탐색 하기 전 연산자 개수 -1
            operatorArr[i]--
            when(i){
                //0이면 +
                0 -> dfs(num + numArr[level], level + 1)
                //1이면 -
                1 -> dfs(num - numArr[level], level + 1)
                //2이면 *
                2 -> dfs(num * numArr[level], level + 1)
                //3이면 /
                3 -> dfs(num / numArr[level], level + 1)
            }
            //탐색하고 스택에서 빠져나오면 +1
            operatorArr[i]++
        }
    }

}
