import kotlin.math.round
import kotlin.math.roundToInt

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val testCase = br.readLine().toInt()
    val arr = IntArray(8001)

    var mostCount = 0
    for(i in 0 until testCase){
        val num =br.readLine().toInt()
        arr[num+4000]++
        if(arr[num+4000]>mostCount)
            mostCount = arr[num+4000]
    }
    br.close()
    var index = 0
    var sum = 0
    var midNum = 0
    var mostNum = 0
    var mostNumFoundCount = 0
    var minNum = 4000
    var maxNum = -4000
    for (i in 0 until 8001) {
        val num = i-4000
        if (arr[i] > 0) {
            for (j in 0 until arr[i]) {
                sum += num
                index += 1
                if (index == testCase/2+1) midNum = num
            }
            if (maxNum < num) maxNum = num
            if (minNum > num) minNum = num
            if (arr[i] == mostCount) {
                if (mostNumFoundCount < 2) mostNum = num
                mostNumFoundCount += 1
            }
        }
    }
    bw.write("${(sum.toDouble()/testCase.toDouble()).roundToInt()}\n")//산술평균
    bw.write("$midNum\n")//최솟값
    bw.write("$mostNum\n")//최빈값
    bw.write("${maxNum-minNum}")//범위

    bw.flush()
    bw.close()
}
