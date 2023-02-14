// Вывести строку A, заменяя всех шпионов на символ _ и количество шпионов через пробел.
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    var input1 = scan.next()
    var input2 = scan.next()
    print(input1.replace(input2, "_") + " ${input1.length - input1.replace(input2, "").length}")
}