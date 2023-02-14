fun main() {
    val byteConst: Byte = 127
    val shortConst: Short = 128
    val intConst: Int = 129
    val longConst: Long = 130L
    val stringConst: String = "Hello"
    val charConst: Char = 'A'
    val floatConst: Float = 1.123f
    val doubleConst: Double = 1.12345678910
    val booleanComst: Boolean = true

    println("Byte to Short -\t\t" + byteConst + "-" + byteConst.javaClass.name + "\t" + byteConst.toShort() + "-" + byteConst.toShort().javaClass.name)
    println("Byte to Int -\t\t" + byteConst + "-" + byteConst.javaClass.name + "\t" + byteConst.toInt() + "-" + byteConst.toInt().javaClass.name)
    println("Byte to Long -\t\t" + byteConst + "-" + byteConst.javaClass.name + "\t" + byteConst.toLong() + "-" + byteConst.toLong().javaClass.name)
    println("Byte to String -\t" + byteConst + "-" + byteConst.javaClass.name + "\t" + byteConst.toString() + "-" + byteConst.toString().javaClass.name)
    println("Byte to Char -\t\t" + byteConst + "-" + byteConst.javaClass.name + "\t" + byteConst.toChar() + "-" + byteConst.toChar().javaClass.name)
    println("Byte to Float -\t\t" + byteConst + "-" + byteConst.javaClass.name + "\t" + byteConst.toFloat() + "-" + byteConst.toFloat().javaClass.name)
    println("Byte to Double -\t" + byteConst + "-" + byteConst.javaClass.name + "\t" + byteConst.toDouble() + "-" + byteConst.toDouble().javaClass.name)

    println("\nShort to Byte -\t\t" + shortConst + "-" + shortConst.javaClass.name + "\t" + shortConst.toByte() + "-" + shortConst.toByte().javaClass.name)
    println("Short to Int -\t\t" + shortConst + "-" + shortConst.javaClass.name + "\t" + shortConst.toInt() + "-" + shortConst.toInt().javaClass.name)
    println("Short to Long -\t\t" + shortConst + "-" + shortConst.javaClass.name + "\t" + shortConst.toLong() + "-" + shortConst.toLong().javaClass.name)
    println("Short to String -\t" + shortConst + "-" + shortConst.javaClass.name + "\t" + shortConst.toString() + "-" + shortConst.toString().javaClass.name)
    println("Short to Char -\t\t" + shortConst + "-" + shortConst.javaClass.name + "\t" + shortConst.toChar() + "-" + shortConst.toChar().javaClass.name)
    println("Short to Float -\t" + shortConst + "-" + shortConst.javaClass.name + "\t" + shortConst.toFloat() + "-" + shortConst.toFloat().javaClass.name)
    println("Short to Double -\t" + shortConst + "-" + shortConst.javaClass.name + "\t" + shortConst.toDouble() + "-" + shortConst.toDouble().javaClass.name)

    println("\nInt to Short -\t\t" + intConst + "-" + intConst.javaClass.name + "\t" + intConst.toShort() + "-" +  intConst.toShort().javaClass.name)
    println("Int to Byte -\t\t" +    intConst + "-" + intConst.javaClass.name + "\t" + intConst.toByte() + "-" +   intConst.toByte().javaClass.name)
    println("Int to Long -\t\t" +    intConst + "-" + intConst.javaClass.name + "\t" + intConst.toLong() + "-" +   intConst.toLong().javaClass.name)
    println("Int to String -\t\t" +  intConst + "-" + intConst.javaClass.name + "\t" + intConst.toString() + "-" + intConst.toString().javaClass.name)
    println("Int to Char -\t\t" +    intConst + "-" + intConst.javaClass.name + "\t" + intConst.toChar() + "-" +   intConst.toChar().javaClass.name)
    println("Int to Float -\t\t" +   intConst + "-" + intConst.javaClass.name + "\t" + intConst.toFloat() + "-" +  intConst.toFloat().javaClass.name)
    println("Int to Double -\t\t" +  intConst + "-" + intConst.javaClass.name + "\t" + intConst.toDouble() + "-" + intConst.toDouble().javaClass.name)

    println("\nLong to Short -\t\t" + longConst + "-" + longConst.javaClass.name + "\t" + longConst.toShort() + "-" +  longConst.toShort().javaClass.name)
    println("Long to Byte -\t\t" +    longConst + "-" + longConst.javaClass.name + "\t" + longConst.toByte() + "-" +   longConst.toByte().javaClass.name)
    println("Long to Long -\t\t" +    longConst + "-" + longConst.javaClass.name + "\t" + longConst.toLong() + "-" +   longConst.toLong().javaClass.name)
    println("Long to String -\t" +  longConst + "-" + longConst.javaClass.name + "\t" + longConst.toString() + "-" + longConst.toString().javaClass.name)
    println("Long to Char -\t\t" +    longConst + "-" + longConst.javaClass.name + "\t" + longConst.toChar() + "-" +   longConst.toChar().javaClass.name)
    println("Long to Float -\t\t" +   longConst + "-" + longConst.javaClass.name + "\t" + longConst.toFloat() + "-" +  longConst.toFloat().javaClass.name)
    println("Long to Double -\t" +  longConst + "-" + longConst.javaClass.name + "\t" + longConst.toDouble() + "-" + longConst.toDouble().javaClass.name)
// NumberFormatException
//    println("\nString to Short -\t\t" + stringConst + "-" + stringConst.javaClass.name + "\t" + stringConst.toShort() + "-" +  stringConst.toShort().javaClass.name)
//    println("String to Byte -\t\t" +    stringConst + "-" + stringConst.javaClass.name + "\t" + stringConst.toByte() + "-" +   stringConst.toByte().javaClass.name)
//    println("String to Long -\t\t" +    stringConst + "-" + stringConst.javaClass.name + "\t" + stringConst.toLong() + "-" +   stringConst.toLong().javaClass.name)
//    println("String to Int -\t\t" +     stringConst + "-" + stringConst.javaClass.name + "\t" + stringConst.toInt() + "-" + stringConst.toInt().javaClass.name)
//    println("String to Char -\t\t" +    stringConst + "-" + stringConst.javaClass.name + "\t" + stringConst.first() + "-" +   stringConst.first().javaClass.name)
//    println("String to Float -\t\t" +   stringConst + "-" + stringConst.javaClass.name + "\t" + stringConst.toFloat() + "-" +  stringConst.toFloat().javaClass.name)
//    println("String to Double -\t\t" +  stringConst + "-" + stringConst.javaClass.name + "\t" + stringConst.toDouble() + "-" + stringConst.toDouble().javaClass.name)

    println("\nChar to Short -\t\t" + charConst + "-" + charConst.javaClass.name + "\t" + charConst.toShort() + "-" +  charConst.toShort().javaClass.name)
    println("Char to Byte -\t\t" +    charConst + "-" + charConst.javaClass.name + "\t" + charConst.toByte() + "-" +   charConst.toByte().javaClass.name)
    println("Char to Long -\t\t" +    charConst + "-" + charConst.javaClass.name + "\t" + charConst.toLong() + "-" +   charConst.toLong().javaClass.name)
    println("Char to String -\t" +  charConst + "-" + charConst.javaClass.name + "\t" + charConst.toString() + "-" + charConst.toString().javaClass.name)
    println("Char to Int -\t\t" +     charConst + "-" + charConst.javaClass.name + "\t" + charConst.toInt() + "-" +   charConst.toInt().javaClass.name)
    println("Char to Float -\t\t" +   charConst + "-" + charConst.javaClass.name + "\t" + charConst.toFloat() + "-" +  charConst.toFloat().javaClass.name)
    println("Char to Double -\t" +  charConst + "-" + charConst.javaClass.name + "\t" + charConst.toDouble() + "-" + charConst.toDouble().javaClass.name + "\n")

    //println("\nFloat to Short -\t\t" +floatConst + "-" + floatConst.javaClass.name + "\t" + floatConst.toShort() + "-" +  floatConst.toShort().javaClass.name)
    //println("Float to Byte -\t\t" +   floatConst + "-" + floatConst.javaClass.name + "\t" + floatConst.toByte() + "-" +   floatConst.toByte().javaClass.name)
    println("Float to Long -\t\t" +   floatConst + "-" + floatConst.javaClass.name + "\t" + floatConst.toLong() + "-" +   floatConst.toLong().javaClass.name)
    println("Float to String -\t" +   floatConst + "-" + floatConst.javaClass.name + "\t" + floatConst.toString() + "-" + floatConst.toString().javaClass.name)
    println("Float to Int -\t\t" +    floatConst + "-" + floatConst.javaClass.name + "\t" + floatConst.toInt() + "-" +    floatConst.toInt().javaClass.name)
    println("Float to Char -\t\t" +   floatConst + "-" + floatConst.javaClass.name + "\t" + floatConst.toFloat() + "-" +  floatConst.toFloat().javaClass.name)
    println("Float to Double -\t" +   floatConst + "-" + floatConst.javaClass.name + "\t" + floatConst.toDouble() + "-" + floatConst.toDouble().javaClass.name + "\n")

    //println("\nDouble to Short -\t\t" + doubleConst + "-" + doubleConst.javaClass.name + "\t" + doubleConst.toShort() + "-" +  doubleConst.toShort().javaClass.name)
    //println("Double to Byte -\t\t" +    doubleConst + "-" + doubleConst.javaClass.name + "\t" + doubleConst.toByte() + "-" +   doubleConst.toByte().javaClass.name)
    println("Double to Long -\t" +    doubleConst + "-" + doubleConst.javaClass.name + "\t" + doubleConst.toLong() + "-" +   doubleConst.toLong().javaClass.name)
    println("Double to String -\t" +    doubleConst + "-" + doubleConst.javaClass.name + "\t" + doubleConst.toString() + "-" + doubleConst.toString().javaClass.name)
    println("Double to Int -\t\t" +     doubleConst + "-" + doubleConst.javaClass.name + "\t" + doubleConst.toInt() + "-" +    doubleConst.toInt().javaClass.name)
    println("Double to Float -\t" +   doubleConst + "-" + doubleConst.javaClass.name + "\t" + doubleConst.toFloat() + "-" +  doubleConst.toFloat().javaClass.name)
    println("Double to Char -\t" +      doubleConst + "-" + doubleConst.javaClass.name + "\t" + doubleConst.toDouble() + "-" + doubleConst.toDouble().javaClass.name)
}

