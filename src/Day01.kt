import java.io.File

fun main() {
    var increase = 0
    val depths = getListOfInt("src/aoc_2021_day1.txt")
    for(i in 1 until depths.size) {
        if (depths[i] > depths[i-1]) {
            increase++
        }
    }
    print(increase)
}

private fun getListOfInt(name: String): List<Int> = readInput("aoc_2021_day1").map {
    it.toInt()
}

private fun readInput(name: String) = File("src", "$name.txt").readLines()
