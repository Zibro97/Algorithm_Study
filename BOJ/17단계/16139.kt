import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val s = StringBuilder(readLine())
    val sum = Array(s.length){ IntArray(26) }
    val q = readLine().toInt()
    val sb = StringBuilder()

    sum[0][s[0] - 'a']++
    for(i in 1 until s.length){
        val tmp = s[i] - 'a'
        repeat(26){ j->
            sum[i][j] = sum[i-1][j]
        }
        sum[i][tmp]++
    }
    repeat(q){
        val (a,l,r) = readLine().split(" ")

        if(l.toInt() == 0) sb.append(sum[r.toInt()][a[0] - 'a']).append('\n')
        else sb.append(sum[r.toInt()][a[0]-'a'] - sum[l.toInt()-1][a[0]-'a']).append('\n')
    }
    println(sb)
    close()
}
