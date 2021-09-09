package vguard.`study-collections`

fun main(){
    val values = IntArray(5)
    values[0] = 5
    values[1] = 80
    values[2] = 15
    values[3] = 20
    values[4] = 25

    for(x in values){
        println(x)
    }
    println("-------------------------------------")

    values.forEach { valor ->
        println(valor)
    }

    println("-------------------------------------")

    for(index in values.indices){
        println(values[index])
    }

    println("-------------------------------------")

    values.sort()
    for (x in values){
        println(x)
    }

}