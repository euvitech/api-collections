package vguard.`study-collections`

fun main(){
    val pair: Pair<String, Double> = Pair("Vinicius", 3000.0)
    val map1 = mapOf(pair)

    map1.forEach(){(x, y) -> println("Chave: $x = Valor: $y")}

    val map2 = mapOf(
        "Rayston" to 4200.0,
        "João" to 3200.0,
        "Jeafferson" to 1200.0
    )

    map2.forEach(){(x, y) -> println("Chave: $x = Valor: $y")}
}