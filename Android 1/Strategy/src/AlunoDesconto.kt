package interfaces

interface Contribuinte {
    fun valorDevido(mensalidade: Double) = mensalidade
}

fun main(args: Array<String>) {
    class Aluno(val name: String, val mensalidade: Double, val ex: Boolean)
    class PagamentoCompleto : Contribuinte
//    class PagamentoComDesconto : Contribuinte {
//        override fun valorDevido(mensalidade: Double)= mensalidade * 0.8
//    }
    val exAluno = Aluno("Fulano", 780.0, true)


    val valor = calcular(exAluno.mensalidade, PagamentoCompleto())

    val valorComDesconto = calcular(exAluno.mensalidade, object: Contribuinte {
        override fun valorDevido(mensalidade: Double)= mensalidade * 0.8
    })

    println(valor)
    println(valorComDesconto)
}

fun calcular(mensalidade: Double, comDesconto: Contribuinte) : Double {
    return comDesconto.valorDevido(mensalidade)
}