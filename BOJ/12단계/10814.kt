import java.util.*

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val testCase = br.readLine().toInt()
    val arr = Array(testCase){ Pair(0,"")}

    for(i in 0 until testCase){
        val input = StringTokenizer(br.readLine())
        arr[i] = Pair(input.nextToken().toInt(),input.nextToken())
    }
    Arrays.sort(arr) { e1,e2 ->
        return@sort e1.first- e2.first
    }
    arr.forEach {
        bw.write("${it.first} ${it.second}\n")
    }
    br.close()
    bw.flush()
    bw.close()
}
