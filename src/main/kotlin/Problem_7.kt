import java.lang.Math.abs

fun main(){
    print (reverse(44434))
}
fun reverse(x: Int): Int {
    var num = x
//    if (x<0) return ("-" + abs(x).toString().reversed()).toInt()
//    else
//    return x.toString().reversed().toInt()
    var reverse: String
    if (num === 0 && num > Int.MAX_VALUE && num < Int.MIN_VALUE) {
        return 0
    }
    if (num < 0) {
        num = abs(num)
        val temp = java.lang.String.valueOf(num)
        val len = temp.length
        reverse = "-"
        for (i in len - 1 downTo 0) {
            reverse = reverse + temp[i]
        }
    } else {
        val temp = java.lang.String.valueOf(num)
        val len = temp.length
        reverse = ""
        for (i in len - 1 downTo 0) {
            reverse = reverse + temp[i]
        }
    }
    return try {
        reverse.toInt()
    } catch (e: Exception) {
        0
    }
}