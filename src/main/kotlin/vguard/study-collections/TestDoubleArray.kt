package vguard.`study-collections`

fun main(){
    val salarys = doubleArrayOf(2000.0, 3000.0, 650.0)

    salarys.forEach { println(it) }

    println("==========================================")

    salarys.forEachIndexed { index, salary -> salarys[index] = salary * 1.1 }

    salarys.forEach { println(it) }
}
