import java.util.*

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val testCase = br.readLine().toInt()
    val arr = Array<Pair<Int,Int>>(testCase){ Pair(0,0)}

    for(i in 0 until testCase){
        val input = StringTokenizer(br.readLine())
        arr[i] = Pair(input.nextToken().toInt(),input.nextToken().toInt())
    }
    br.close()
    Arrays.sort(arr) { e1, e2 ->
        if (e1.second == e2.second) {
            return@sort e1.first- e2.first
        } else {
            return@sort e1.second - e2.second
        }
    }
    for (i in 0 until testCase){
        bw.write("${arr[i].first} ${arr[i].second}\n")
    }
    bw.flush()
    bw.close()
}
