fun main() {
    val res = star(readLine()!!.toInt())
    for (i in res.indices) println(res[i])
}

fun star(n: Int): List<String> = when (n) {
    3 -> arrayListOf(//3개일때 기본 틀
        "***",
        "* *",
        "***"
    )
    else -> star(n / 3).plus(star(n / 3)).plus(star(n / 3)).mapIndexed { index, s ->
        s + (if (n / 3 <= index && index < 2 * n / 3) s.replace('*', ' ') else s) + s
    }
}
