/*
Напишите программу, которая считывает четыре переменных типа Int и переменную EE типа Boolean. И выводит:

Если E = true, то минимальное из этих чисел
Иначе - максимальное.
NB! При наличии нескольких минимумов/максимумов выводим ровно одно из них.
 */
val scan = java.util.Scanner(System.`in`)
fun main() {
    var mylist :MutableList<Int> = mutableListOf()
    for (i in 0..3)
        mylist.add(scan.nextInt())
    if (scan.nextBoolean() == false)
        print(mylist.maxOrNull())
    else
        print(mylist.minOrNull())
}