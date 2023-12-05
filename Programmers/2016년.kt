//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12901
//입출력 예
//a : 5, b : 24, result "TUE"

class Solution {
    val DAY = arrayOf(
        "THU",
        "FRI",
        "SAT",
        "SUN",
        "MON",
        "TUE",
        "WED")
    val MONTH = arrayOf(
        31,
        29,
        31,
        30,
        31,
        30,
        31,
        31,
        30,
        31,
        30,
        31)
    fun solution(month:Int,date:Int) : String = DAY[(MONTH.filterIndexed { index, _ -> index < month-1 }.sum() + date) % 7]
}
