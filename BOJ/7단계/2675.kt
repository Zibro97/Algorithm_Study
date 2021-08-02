import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val case = br.readLine().toInt() //테스트 케이스

    for(i in 0..case-1){
        val r = br.readLine()
        val cnt = r.split(" ")[0].toInt() //반복횟수
        val s = r.split(" ")[1] // 문자열

        for(j in 0..s.length-1){
            for(k in 0..cnt-1){
                print("${s[j]}")
            }
        }
        println()
    }

}
