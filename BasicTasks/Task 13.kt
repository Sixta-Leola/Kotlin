/*
Напишите программу, которая считывает пять различных имён, записанных через пробел и исправляет ошибки в их написании.
 */
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    var list = MutableList(5,{scan.next()})
    for (name in list)
        print("${name.toLowerCase().capitalize()} ")
}