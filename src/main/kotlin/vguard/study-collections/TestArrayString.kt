package vguard.`study-collections`

fun main() {
    val names = arrayOf("Vinicius", "Ana", "João", "Pedro")

    names.forEach { name ->
        println(name)
    }

    println("----------------------")

    names.sort()
    names.forEach { name ->
        println(name)
    }
}