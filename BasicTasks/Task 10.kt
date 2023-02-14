// Напишите программу, которая считывает переменную RR типа Double - радиус окружности, и выводит площадь круга с таким  радиусом,
//округлённую   по правилам математики
val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)
fun main() {
    val input = scan.nextDouble()
    print(Math.round(Math.PI * input * input))
}