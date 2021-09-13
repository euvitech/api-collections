package vguard.`study-collections`

fun main() {
    val vinicius = Funcionarios("Vinicius", 18, 3000.0, "CLT")
    val rayston = Funcionarios("Rayston", 24, 2200.0, "PJ")
    val joao = Funcionarios("João", 14, 4000.0, "CLT")

    val funcionarios1 = listOf(vinicius, rayston)
    val funcionarios2 = listOf(joao)
    val funcionarios3 = listOf(joao, vinicius, rayston)

    val resultUnion = funcionarios1.groupBy { funcionarios2 }
    resultUnion.forEach{ println(it) }

    println("==================================")

    val resultUnion2 = funcionarios1.union(funcionarios2)
    resultUnion2.forEach(){ println(it) }

    println("===================================")

    val resultUnion3 = funcionarios3.subtract(funcionarios1)
    resultUnion3.forEach(){ println(it) }

    println("===================================")

    val resultUnion4 = funcionarios3.intersect(funcionarios1)
    resultUnion4.forEach(){ println(it) }
}