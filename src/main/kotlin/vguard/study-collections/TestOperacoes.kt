package vguard.`study-collections`

fun main() {
    val salarys = doubleArrayOf(1200.0, 3000.0, 5000.0)

    println("===========================")

        println("""
            Salário minimo: ${salarys.minOrNull()}
            Salário médio:  ${salarys.average()}
            Salário maximo: ${salarys.maxOrNull()}
        """.trimIndent())

    println("===========================")

    val maxSalary = salarys.filter { it > 4000.0 }

    maxSalary.forEach(){
        println(it)
    }

    println("===========================")

    println(salarys.count(){it in 2452.0..5000.0})

    println("===========================")

    println(salarys.find { it == 3000.0 })
    println(salarys.find { it == 5236.0 })

    println("===========================")

    println(salarys.any { it == 5236.0 })
    println(salarys.any { it == 3000.0 })
}