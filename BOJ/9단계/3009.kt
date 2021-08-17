import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    var preDotX:Int =0
    var preDotY:Int =0
    
    var dotX:Int =0
    var dotY:Int =0

    for(i in 0..2){
        val arr = br.readLine().split(" ").map { it.toInt() }
        val x = arr[0]
        val y = arr[1]
        
        when(i){
            0 ->{
                preDotX = x
                preDotY = y
            }
            1->{
                dotX = x
                dotY = y
            }
            else ->{
                if(preDotX == dotX){
                    print("$x ")
                }else{
                    if(preDotX == x){
                        print("$dotX ")
                    }else{
                        print("$preDotX ")
                    }
                }
                if(preDotY == dotY){
                    println("$y")
                }else{
                    if(preDotY == y){
                        println("$dotY")
                    }else{
                        println("$preDotY")
                    }
                }
            }
        }
    }
}
