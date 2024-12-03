import java.util.Random


//20 pessoas -> gerar 20 números aleatórios e assign one for each one of the people
fun generate() {
    //given a list of 20 names -> assign random numbers from 1 to 20 to each one of the names
    //problem ->





}

fun main() {
    val result = hashMapOf<String, Int>()

    val list = mutableListOf("caio", "mariana", "rita", "joseni", "julia")
    val n = list.size

    var x = (1..n).toMutableList()


    for(name in list) {
        result[name] = x.random().also {current ->
            x.remove(current)
        }
    }

    result.forEach {
        println("${it.key} -> ${it.value}")
    }
}
