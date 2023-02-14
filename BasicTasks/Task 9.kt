/* Напишите программу, которая считывает строку и выводит:

"A", если её длина больше 0 и меньше 11;
"B", если её длина равна 20
"C", если её длина равна 15
"D" во всех остальных случаях.

 */
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    var input = scan.nextLine().length
    print (when (input) {
           in 1..10 ->"A"
           20 ->"B"
           15 ->"C"
           else ->"D"
           }
    )
}