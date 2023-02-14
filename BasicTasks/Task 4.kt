//Напишите программу, которая считывает строку и выводит её три раза.
fun main(){
    val scan = java.util.Scanner(System.`in`)
    var input :String = scan.nextLine()
    print("$input\n$input\n$input")
}