//Contact
fun main() {
    //직녀성 전파
    val star = Regex("(100+1+|01)+")
    val t = readLine()!!.toInt()

    repeat(t){
        val waves : String = readLine()!!
        //정규식 체크
        if(waves.matches(star)) println("YES")
        else println("NO")
    }
}
