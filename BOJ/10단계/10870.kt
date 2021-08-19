fun main() {
    val input = readLine()!!.toInt()
    print(Fibonacci(input))
}
private fun Fibonacci(n:Int):Int{
    if(n == 0)
        return 0
    else if(n==1)
        return 1
    return Fibonacci(n-1) + Fibonacci(n-2)
}
