//수열
fun main() {
    //n : 온도를 측정한 전체 날짜의 수
    //k : 합을 구하기 위한 연속적인 날짜의 수 
    val (n,k) = readLine()!!.split(" ").map { it.toInt() }
    //매일 측정한 온도를 나타내는 N개의 정수
    val arr =  readLine()!!.split(" ").map {it.toInt()}.toMutableList()
    val sumArr = IntArray(n-(k-1)) {0}

    repeat(n-(k-1)){
        for(j in it until it+k){
            sumArr[it] += arr[j]
        }
    }

    print(sumArr.maxOrNull())
}
//todo : 시간 복잡도 고려하기
