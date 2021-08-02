import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val s = br.readLine()
    var map = mutableMapOf<Char,Int>()

    s.forEach {
        val char = it.lowercaseChar() //알파벳 각각을 소문자로 변환

        if(map.containsKey(char)){ //키값이 이미 존재하면 +1
            map[char] = map[char]!!.plus(1)
        }else{ //없으면 1로 초기화
            map.set(char,1)
        }
    }
    val max = map.maxByOrNull { it.value } //value값이 가장 큰 값을 max에 담음

    if(map.filter { it.value == max!!.value }.count() > 1){ //가장 큰 값이 여러 개이면 ?출력
        print("?")
    }else{ 
        print(max!!.key.uppercase())
    }
}
