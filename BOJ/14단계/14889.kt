import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.absoluteValue

//s 능력치 2차원 배열
lateinit var ability : Array<IntArray>
//방문했는지 체크하는 배열
lateinit var isVisited: BooleanArray
private var min = Integer.MAX_VALUE


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    ability = Array(size){ readLine().split(' ').map { it.toInt() }.toIntArray() }
    isVisited = BooleanArray(size)

    //dfs 시작
    dfs(0,0)
    println(min)

    close()
}
//백트래킹 dfs
private fun dfs(num: Int, level: Int) {
    //2개의 팀을 나누니까 인원수의 1/2만큼 탐색
    if (level == ability.size/2 ) {
        var sum = 0
        for(i in ability.indices){
            //방문한 팀 / 방문하지 않은 팀으로 전체 능력치 합산
            for(j in i+1 until ability.size){
                if(i != j){
                    if(isVisited[i] && isVisited[j]) sum += (ability[i][j] + ability[j][i])
                    else if(!isVisited[i] && !isVisited[j]) sum -= (ability[i][j] + ability[j][i])
                }
            }
        }
        min = Math.min(min, sum.absoluteValue)
        return
    }
    for (i in num until ability.size) {
        //방문하지 않은 노드라면 탐색
        if(!isVisited[i]){
            isVisited[i] = true
            dfs(i+1,level +1)
            isVisited[i] = false
        }
    }

}
