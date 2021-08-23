import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw =BufferedWriter(OutputStreamWriter(System.out))
    var input = StringTokenizer(br.readLine()) //n: 카드 개수 m : 3장 카드으로 만들 수 있는 최대 합
    val n = input.nextToken().toInt() 
    val m = input.nextToken().toInt()

    input = StringTokenizer(br.readLine()) //카드에 쓰여 있는 수
    val arr:ArrayList<Int> = arrayListOf()

    for(i in 0 until n){
        arr.add(input.nextToken().toInt())
    }
    br.close()
    var sum = 0 //카드 3장의 수를 합산한 값
    var max = 0 //for문 돌릴 때마다 m보다 작은 최댓값 저장

    for(first in 0 until n){
        for(second in first+1 until n){
            for(third in second+1 until n){
                sum = arr[first]+arr[second]+arr[third]
                if(sum > max&&sum <= m) max = sum
            }
        }
    }
    bw.write("$max")
    bw.flush()
    bw.close()
}
