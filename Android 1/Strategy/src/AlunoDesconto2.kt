package alias
typealias Contribuinte = (Double) -> Double

fun main(args: Array<String>) {
    class Aluno(val name: String, val mensalidade: Double, val ex: Boolean)

    val exAluno = Aluno("Fulano", 780.0, true)


    val valor = calcular(exAluno.mensalidade, {mensalidade : Double -> mensalidade})

    val valorComDesconto = calcular(exAluno.mensalidade, {mensalidade : Double -> mensalidade * 0.8})

    println(valor)
    println(valorComDesconto)
}

fun calcular(mensalidade: Double, comDesconto: Contribuinte) : Double {
    return comDesconto(mensalidade)
}