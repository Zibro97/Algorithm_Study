import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (row, column) = br.readLine().split(" ").map{ it.toInt()}
    val board = Array(row){" "}
    repeat(row){
        board[it] = br.readLine()
    }

    var result = 64
    val blackWhite = arrayOf('B','W')
    val whiteBlack = arrayOf('W','B')
    for(i in 0..row-8){
        for(j in 0..column-8){
            var cnt1 = 0
            var cnt2 = 0
            for(k in i..i+7){
                for(l in j..j+7){
                    if(blackWhite[(k+l)%2] != board[k][j]) cnt1++
                    if(whiteBlack[(k+l)%2] != board[k][l]) cnt2++
                }
            }
            result = result.coerceAtMost(cnt1.coerceAtMost(cnt2))
        }
    }
    bw.write("$result")
    bw.flush()
    bw.close()
    br.close()
}
