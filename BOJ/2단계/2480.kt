import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var list=readLine().split(' ').sorted()
    val set = list.toSet()

    if(set.size==1){
        print(10000+list[0].toInt()*1000)
    }else if(set.size ==2){
        print(1000 + list[1].toInt()*100)
    }else{
        print(list[2].toInt()*100)
    }
}
