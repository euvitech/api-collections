package vguard.`study-collections`

fun main() {
    val vinicius = Funcionarios("Vinicius", 18, 3000.0, "CLT")
    val rayston = Funcionarios("Rayston", 24, 2200.0, "PJ")
    val joao = Funcionarios("João", 14, 4000.0, "CLT")

    val funcionarios = listOf(vinicius, rayston, joao)

    funcionarios.forEach{ println( it )}

    println("====================================")

    println(funcionarios.find { it.name == "Vinicius" })

    println("====================================")

    funcionarios
        .sortedBy { it.salary }
        .forEach{ print(it)}

    println("====================================")

    funcionarios
        .groupBy { it.typecontract }
        .forEach{ print(it)}
}



