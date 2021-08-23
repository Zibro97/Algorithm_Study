import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val testCase = br.readLine().toInt() //전체 사람 수
    var arr = Array<Pair<Int,Int>>(testCase){ Pair(0,0)} //Pair 함수는 서로 같거나 다른 타입의 두 객체를 담을 수 있는 함수
    var rank = IntArray(testCase){1}
    for(i in 0 until testCase){
        val bulk = StringTokenizer(br.readLine()) // (몸무게 키)
        arr[i] = Pair(bulk.nextToken().toInt(),bulk.nextToken().toInt())
    }
    br.close()
    for(i in 0 until testCase){
        for(j in 0 until testCase){
            if(arr[i].first > arr[j].first && arr[i].second > arr[j].second){ //앞뒤 사람끼리 키와 몸무게 비교 후 rank +1
                rank[j]++
            }
        }
    }
    rank.forEach{
        bw.write("$it ")
    }
    bw.flush()
    bw.close()
}
