fun main() {
    val s = StringBuilder(readLine())
    val q = readLine()!!.toInt()

    repeat(q){
        val (a,l,r) = readLine()!!.split(" ")
        var cnt =0
        for(i in l.toInt()..r.toInt()){
           if(s[i] == a[0])  cnt++
        }
        println(cnt)
    }
}
