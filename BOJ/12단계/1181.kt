import java.util.*

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val testCase = br.readLine().toInt()
    val set = mutableSetOf<String>()

    for(i in 0 until testCase){
        set.add(br.readLine())
    }
    val list = set.sortedWith() { e1,e2 ->
        if(e1.length == e2.length)
            return@sortedWith e1.compareTo(e2)
        else
            return@sortedWith e1.length - e2.length
    }
    list.forEach {
        bw.write("$it\n")
    }
    br.close()
    bw.flush()
    bw.close()
}
