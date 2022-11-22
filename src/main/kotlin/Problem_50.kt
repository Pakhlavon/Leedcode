fun main(){
    print(myPow(2.00000,-2))
}
fun myPow(x: Double, n: Int): Double {

    return String.format("%.5f", Math.pow(x,n.toDouble())).toDouble()
}