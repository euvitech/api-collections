package vguard.`study-collections`

    data class Funcionarios (
        val name: String,
        val age: Int,
        val salary: Double,
        val typecontract: String
    ) {
        override fun toString(): String =
            """
            Nome: $name
            Idade: $age anos
            Salário: R$$salary
        """.trimIndent()
    }
