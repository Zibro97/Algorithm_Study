import java.util.*

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val testCase = br.readLine().toInt()
    val input = StringTokenizer(br.readLine())
    val arr = IntArray(testCase)
    val sortedArr = IntArray(testCase)
    val map = mutableMapOf<Int,Int>()

    for(i in 0 until testCase){
        val num =input.nextToken().toInt()
        arr[i] = num
        sortedArr[i] = num
    }
    Arrays.sort(sortedArr)
    var cnt = 0
    for(i in 0 until testCase){
        if(map[sortedArr[i]]==null)
            map[sortedArr[i]] = cnt++
    }
    arr.forEach {
        bw.write("${map[it]} ")
    }
    br.close()
    bw.flush()
    bw.close()
}
