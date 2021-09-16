package vguard.`study-collections`

fun main(){
    val vinicius = Funcionarios("Vinicius", 18, 3000.0, "CLT")
    val rayston = Funcionarios("Rayston", 24, 2200.0, "PJ")
    val joao = Funcionarios("João", 14, 4000.0, "CLT")

    val funcionarios = mutableListOf(vinicius, rayston)
    funcionarios.forEach{ peoples -> println(peoples)}

    println("=============================================")

    funcionarios.add(joao)
    funcionarios.forEach{ peoples -> println(peoples)}

    println("=============================================")

    funcionarios.remove(vinicius)
    funcionarios.forEach { peoples -> println(peoples) }

    println("================= SET =======================")

    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { add -> println(add) }

    println("=============================================")

    funcionariosSet.add(vinicius)
    funcionariosSet.add(rayston)

    funcionariosSet.forEach { add -> println(add) }
}