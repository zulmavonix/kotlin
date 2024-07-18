fun main() {

    val array    = arrayOf("Test1","Test2","Test3")

    var total    = 0
    for (names in array) {
        println(names)
        total++
    }
    println("Total = $total")

    var ukuranArray = array.size - 1
    for (i in 0..ukuranArray) {
        println("Index $i = ${array.get(i)}")
    }
}