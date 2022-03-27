import java.io.BufferedReader
import java.io.InputStreamReader

data class Time(val s:Int,val e:Int):Comparable<Time>{
    override fun compareTo(o: Time): Int {
        //끝나는 시간이 같으면 시작시간에 따라 오름차순
        return if(this.e==o.e) this.s-o.s
        else this.e-o.e
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val t = readLine().toInt()
    val meeting = Array(t){
        var (s,e) = readLine().split(" ").map { it.toInt() }
        Time(s,e)
    }.sorted()
    var et = 0
    var cnt = 0
    meeting.forEach { time->
        if(time.s >= et){
            cnt++
            et = time.e
        }
    }

    println("$cnt")
    close()
}
