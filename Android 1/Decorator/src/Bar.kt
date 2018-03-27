package bar
/*
bebidas:
cachaça
rum
vodka
tequila

adicionais
limao
refrigerante
suco
leite cond
gelo
açucar
sal

coquiteis:
vodka + suco + gelo + açúcar
tequila + limão + sal
cachaça + leite cond + açucar + gelo

só uma bebida por coquitel
 */
interface Coquitel {
    val nome: String
    val preco: Double

    fun prepara()
}

interface CoquitelDecorator : Coquitel
interface BebidaBaseParaCoquitel : Coquitel{
    override fun prepara() {
        println(this.nome)
    }
}

class Cachaca : BebidaBaseParaCoquitel {
    override val nome = "Cachaça"
    override val preco = 1.0
}

class Vodka : BebidaBaseParaCoquitel {
    override val nome = "Vodka"
    override val preco = 1.0
}

class Tequila : BebidaBaseParaCoquitel {
    override val nome = "Tequila"
    override val preco = 1.0
}

class Rum : BebidaBaseParaCoquitel {
    override val nome = "Rum"
    override val preco = 1.0
}

class Limao(private val coquitel: Coquitel) : CoquitelDecorator {
    override val nome = "Limao"
    override val preco = 0.5

    override fun prepara(){
        coquitel.prepara()
        println(this.nome)
    }
}
class Refrigerante(private val coquitel: Coquitel) : CoquitelDecorator {
    override val nome = "Refrigerante"
    override val preco = 0.5

    override fun prepara(){
        coquitel.prepara()
        println(this.nome)
    }
}
class Suco(private val coquitel: Coquitel) : CoquitelDecorator {
    override val nome = "Suco"
    override val preco = 0.5

    override fun prepara(){
        coquitel.prepara()
        println(this.nome)
    }
}
class LeiteCondensado(private val coquitel: Coquitel) : CoquitelDecorator {
    override val nome = "Leite Condensado"
    override val preco = 0.5

    override fun prepara(){
        coquitel.prepara()
        println(this.nome)
    }
}
class Gelo(private val coquitel: Coquitel) : CoquitelDecorator {
    override val nome = "Gelo"
    override val preco = 0.5

    override fun prepara(){
        coquitel.prepara()
        println(this.nome)
    }
}
class Acucar(private val coquitel: Coquitel) : CoquitelDecorator {
    override val nome = "Acucar"
    override val preco = 0.5

    override fun prepara(){
        coquitel.prepara()
        println(this.nome)
    }
}
class Sal(private val coquitel: Coquitel) : CoquitelDecorator {
    override val nome = "Sal"
    override val preco = 0.5

    override fun prepara(){
        coquitel.prepara()
        println(this.nome)
    }
}

fun main(args: Array<String>) {
    val coquitel1 = Acucar(Gelo(Suco(Vodka())))
    val coquitel2 = Sal(Limao(Tequila()))
    val diabetes = Gelo(Acucar(LeiteCondensado(Cachaca())))

    coquitel1.prepara()
    println()
    coquitel2.prepara()
    println()
    diabetes.prepara()
}