//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/77484
//입출력 예
//lottos : [44,1,0,0,31,25], win_nums : [31,10,45,1,6,19], result : [3,5]
//lottos : [0, 0, 0, 0, 0, 0], win_nums :	[38, 19, 20, 40, 15, 25], result : [1,6]
//lottos : [45, 4, 35, 20, 3, 9], win_nums : [20, 9, 3, 45, 4, 35], result : [1, 1]
class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val zero = lottos.filter { it == 0 }.size
        val collectCount = win_nums.size - win_nums.toSet().minus(lottos.toSet()).size
        return intArrayOf(checkRank(collectCount+zero),checkRank(collectCount))
    }
    fun checkRank(collectCount: Int) :Int = when(collectCount){
        6 -> 1
        5 -> 2
        4 -> 3
        3 -> 4
        2 -> 5
        else -> 6
    }
}
