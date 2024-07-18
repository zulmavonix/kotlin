fun main() {

    val nilai = "E"

    when (nilai) {
        "A" -> {
            println("test1")
        }
        "B" -> {
            println("test2")
        }
        "C" -> {
            println("test3")
        }
        else -> println("Tidak Lengkap")
    }

    when(nilai){
        "A","B","C" -> println("Test Lengkap")
        else -> println("Tidak lengkap")
    }

    when{
        nilai == "D" -> println("Tidak lulus")
        else -> println("Tidak ada")
    }
}