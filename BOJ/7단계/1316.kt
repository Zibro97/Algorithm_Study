import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var cnt = br.readLine().toInt()
    List(cnt) {
        br.readLine().let { list ->
            var set = HashSet<Char>()
            list.forEachIndexed { index, c ->
                if (!set.contains(c))
                    set.add(c)
                else
                    if (list[index - 1] != c) {
                        cnt--; return@let
                    }
            }
        }
    }
    print(cnt)
}
