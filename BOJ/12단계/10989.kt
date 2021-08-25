fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val testCase = br.readLine().toInt()
    val arr = IntArray(10001)
    for(i in 0 until testCase){
        arr[br.readLine().toInt()]++ //해당 숫자인덱스에만 ++
    }
    br.close()
    for(i in arr.indices){
        bw.write("$i\n".repeat(arr[i])) //해당 인덱스 크기만큼 반복
    }
    bw.flush()
    bw.close()
}
