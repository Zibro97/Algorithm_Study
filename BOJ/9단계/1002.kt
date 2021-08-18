import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val testCase = br.readLine().toInt()//testCase

    for(i in 1..testCase){
        val input = StringTokenizer(br.readLine())
        val x1 = input.nextToken().toDouble()
        val y1 = input.nextToken().toDouble()
        val r1 = input.nextToken().toDouble()
        val x2 = input.nextToken().toDouble()
        val y2 = input.nextToken().toDouble()
        val r2 = input.nextToken().toDouble()

        val d = Math.sqrt((Math.pow((x2-x1),2.0)+Math.pow((y2-y1),2.0)))//두 접점과의 거리

        if(x1==x2&&y1==y2&&r1==r2){ //무수히 많음
            println(-1)
        }else if(d==r1+r2||Math.abs(r1-r2)==d){ // 1점에서 만남(외접,내접)
            println(1)
        }else if(d>r1+r2||x1==x2&&y1==y2&&r1!=r2||d<Math.abs(r1-r2)){ //만나지 않음
            println(0)
        }else{ //두 점에서 만남
            println(2)
        }
    }
}
