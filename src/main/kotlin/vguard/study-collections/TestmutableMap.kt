package vguard.`study-collections`

fun main(){
    val vinicius = Funcionarios("Vinicius", 18, 3000.0, "CLT")
    val rayston = Funcionarios("Rayston", 24, 2200.0, "PJ")
    val joao = Funcionarios("João", 14, 4000.0, "CLT")

    val repository = repository<Funcionarios>()

    repository.create(joao.name, joao)
    repository.create(rayston.name, rayston)
    repository.create(vinicius.name, vinicius)

    println(repository.findById(joao.name))

    println("==========================")
    repository.findAll().forEach { funcionarios -> println(funcionarios) }

    println("==========================")
    repository.remove(rayston.name)
    repository.findAll().forEach { funcionarios -> println(funcionarios) }
}
