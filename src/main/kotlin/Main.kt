import java.util.Scanner

fun main(args: Array<String>){
   convertTemperature(36.50)
}
fun convertTemperature(celsius: Double): DoubleArray {
    val celsius = readLine()!!.toDouble()
    var Kelvin = String.format("%.5f",celsius + 273.15).toDouble()
    var Fahrenheit = String.format("%.5f", celsius *1.80+ 32.00).toDouble()
    return doubleArrayOf(Kelvin, Fahrenheit)
}
