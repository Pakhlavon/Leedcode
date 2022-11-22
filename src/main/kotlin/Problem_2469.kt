fun main(args: Array<String>){
   print(convertTemperature(36.50))
}
fun convertTemperature(celsius: Double): List<String> {
    var Kelvin = String.format("%.5f",celsius + 273.15)
    var Fahrenheit = String.format("%.5f", celsius *1.80+ 32.00)

    return  listOf(Kelvin,Fahrenheit)
}
