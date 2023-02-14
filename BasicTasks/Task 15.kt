/*
На вход подаётся число N, а затем последовательность из N слов, записанных через пробел
или через строку. Нужно полностью перевернуть эту последовательность и вывести в одной строке.
 */
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    var countIn = scan.nextInt()
    val resArray = Array<String>(countIn, {""})
    for (i in 0 until countIn) {
        resArray[i] = scan.next().reversed()
    }
    print(resArray.reversedArray().joinToString(" "))
}