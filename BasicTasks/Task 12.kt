//Напишите программу, которая считывает два слова, введенных через пробел, и выводит true, если они равны и false, если не равны.
//
//Регистр не учитывать.
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    val (input1, input2) = scan.nextLine().split(" ").toList()
    print(input1.equals(input2, true))
}