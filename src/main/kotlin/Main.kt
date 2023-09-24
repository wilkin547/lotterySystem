
fun main() {
    val lotteryList = listOf("Leidsa", "National", "Real","lotopool")

    println("Welcome to the lottery system by Leidsa. We have the following lotteries:")

    // Display the list of lotteries with numeric indices
    lotteryList.forEachIndexed { index, lottery ->
        println("$index. $lottery")
    }

    // Ask the user to select a lottery
    var selectedLottery: String? = null
    while (selectedLottery == null) {
        val indexStr = readLine()
        val index = indexStr?.toIntOrNull()

        if (index != null && index in 0 until lotteryList.size) {
            selectedLottery = lotteryList[index]
        } else {
            println("Plid index.")
        }
    }
    var CountLotery : Int? = when(selectedLottery) {
        "Leidsa", "National", "Real" -> 3
        "lotopool" -> 5
        else -> null
    }
    if (CountLotery == null) {

        println(" tu numero es nulo, cuidado")
        return
    }

    val lista = mutableListOf<Int>()
    //select you number
    while(CountLotery > 0){
        println("Hey seleccion tu jugada numero $CountLotery")
        //obtengo la entrada y la comviero en numeros
        var jugada = readln().toIntOrNull()


        while (jugada == null){
            println("no se permite numeros nulos")
            jugada = readLine()?.toIntOrNull()
        }
        while ( jugada != null && (jugada > 99|| jugada < 0)){
            println("Solo se permiten numeros del rangos")
            jugada = readLine()?.toIntOrNull()

        }

        if(jugada != null && jugada in 0 until 99){
                lista.add(jugada)
        }else {
            println("algo salio mal o no estuviste en el rango de 0-99 o el numero fue nulo o solo puso letras")
            continue
        }



        CountLotery--

    }
    lista.run {sort()}


    println("You have selected the lottery: $selectedLottery \n" +
            "y estos son tus numeros $lista \nahora lanzaremos los numeros de la loteria ")

    val listaDeNumerosGanadores = mutableListOf<Int>()
       while (listaDeNumerosGanadores.size < lista.size){
           val item = (0..99).random()
           listaDeNumerosGanadores += item
       }




    listaDeNumerosGanadores.run { sorted() }
    println(listaDeNumerosGanadores)

}


