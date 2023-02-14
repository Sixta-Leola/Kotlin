//Напишите программу, которая считывает строку и выводит через пробел её первый и последний символ.
fun main() {
    val scan = java.util.Scanner(System.`in`)
    val input = scan.nextLine()
    print(input[0] + " " + input[input.length - 1])
}