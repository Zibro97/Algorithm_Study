import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()

    repeat(num) {
        val number = nextInt()
        val array = IntArray(number)

        for (i in array.indices) {
            array[i] = nextInt()
        }

        val total = totalScore(array)
        val average = average(total, array.size)
        val overPeople = overPeople(array, average)
        overPeopleAverage(overPeople, array.size)
    }
}

private fun totalScore(array: IntArray): Int {
    var total = 0

    for (i in array.indices) {
        total += array[i]
    }

    return total
}

private fun average(total: Int, peoples: Int) = total / peoples
private fun overPeople(array: IntArray, averageScore: Int): Int {
    var overPeople = 0
    for (i in array.indices) {
        if (array[i] > averageScore) {
            overPeople++
        }
    }

    return overPeople
}

private fun overPeopleAverage(overPeople: Int, allPeople: Int) {
    val average = (overPeople.toDouble() / allPeople.toDouble()) * 100
    println(String.format("%.3f%%", average))
}
