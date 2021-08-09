import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader((System.`in`)))
    val testCase = br.readLine().toInt() //테스트 케이스

    var arr = Array<Array<Int>>(15){Array<Int>(15){i-> 1} }

    /*for(i in 0..14){
        for(j in 0..14){
            print("${arr[i][j]}")
        }
        println()
    }*/
    for(i in 0..14){ //0층
        arr[0][i] = i
    }
    for(i in 1..14){ //i층
        for(j in 2..14) {//j호
            arr[i][j] = arr[i][j-1] + arr[i-1][j]
        }
    }

    for(i in 1..testCase){
        val k = br.readLine().toInt()//k층
        val n = br.readLine().toInt()//n호

        println("${arr[k][n]}")
    }
}
