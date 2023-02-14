/*
Ваша задача - написать код функции check, принимающей две строки str1 и str2 и аргумент ignoreCase (по умолчанию равен false).
Функция возвращает true, если первые символы обоих строк равны и false в обратном случае.
Аргумент ignoreCase указывает, нужно ли игнорировать регистр при проверке.
 */
import java.util.*

fun check (str1: String, str2: String, ignoreCase: Boolean = false): Boolean {
    return  if (!ignoreCase) str1[0] == str2[0] else str1.capitalize()[0] == str2.capitalize()[0]
}

val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val s1 = scan.next()
    val s2 = scan.next()

    if(scan.hasNext()) // Если на вход подается Boolean
        print(check(s1,s2,scan.nextBoolean()))
    else
        print(check(s1,s2))
}