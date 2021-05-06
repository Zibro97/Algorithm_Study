//(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    println(a*(b%10))
    println(a*(b%100/10))
    println(a*(b/100))
    print(a*b)
}
