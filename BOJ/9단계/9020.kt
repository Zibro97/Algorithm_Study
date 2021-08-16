import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var testCase = br.readLine().toInt()
    for (i in 1..testCase){
        var input = br.readLine().toInt()

        var a = input / 2
        var b = input - a

        while (true){
            if (isPrime(a) && isPrime(b)){
                break
            } else {
                a--
                b++
            }
        }
        println("$a"+" "+"$b")
    }
}

fun isPrime(n: Int): Boolean{ // 소수 구하기
    var check = true
    var ndb = n.toDouble()
    for(i in 2..(Math.sqrt(ndb).toInt())){
        if(n % i == 0)
            check = false
    }
    return check // 소수면 true 리턴
}
