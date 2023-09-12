
fun main(args: Array<String>) {
    //replica del sistema de Loteria
    var loteriaCorrecta = false
do {
    val indice = Regex("[0-9]")
    val indiceLoteria = presentarMenu()
    println(indice)
}while (false)


}
val listasDeLoterias = listOf("leidsa","nacional","real")

fun presentarMenu() :String{

    println("Bienvenido al sistema de loteria de leidsa, tenemos las siguientes loterias")
    println("-------------------------------------------------------------------------------")
    println("Porfabor seleccione el indice numerico para seleccionar una loteria")

    val listaImprimida = listasDeLoterias.map { "${listasDeLoterias.indexOf(it)} $it" }
    listaImprimida.forEach { println(it) }

    return readln()

}


