import java.util.Random


//20 pessoas -> gerar 20 números aleatórios e assign one for each one of the people
fun generate() {
    //given a list of 20 names -> assign random numbers from 1 to 20 to each one of the names
    //problem ->





}

fun main() {
    val result = hashMapOf<String, Int>()

    val list = mutableListOf("caio", "mariana", "rita", "joseni", "julia")
    val strings = mutableListOf<String>()
    val n = list.size

    var x = (1..n).toMutableList()


    //looping here
    for(name in list) {
        //random is O(1) and remove is O(1)
        strings.add(
            "$name -> ${
                x.random().also {current ->
                    x.remove(current)
                }
            }"
        )
    }

    print(strings.joinToString(", "))
    // solution above ^ it's O(2 * n) == O(n)

}
