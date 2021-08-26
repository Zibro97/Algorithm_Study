fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val num = br.readLine().split("")

    num.sortedDescending().forEach {
        bw.write("$it")
    }

    bw.flush()
    bw.close()
}
