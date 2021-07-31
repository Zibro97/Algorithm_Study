import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var s = br.readLine()
    s = s.lowercase() // 입력 문자열
    var arr = arrayOf(-1,-1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1)

    for(i in 0 until s.length){
        if(arr[s[i]-'`'-1] == -1) {
            arr[s[i] - '`' - 1] = i
        }
    }

    for(i in 0 until 26){
        print(arr[i])
        print(" ")
    }
}
