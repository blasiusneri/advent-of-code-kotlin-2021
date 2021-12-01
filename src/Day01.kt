import java.io.File

fun main() {
    var increase = 0
    val depths = readFile("src/aoc_2021_day1")
    for(i in 1 until depths.size) {
        if (depths[i] > depths[i-1]) {
            increase++
        }
    }
    print(increase)
}

private fun readFile(filename: String): List<Int> = File(filename).useLines { it.toList() }.map {
    it.toInt()
}
