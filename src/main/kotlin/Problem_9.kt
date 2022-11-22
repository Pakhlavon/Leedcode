fun main(args: Array<String>){
    print(isPalindrome(10))
}
fun isPalindrome(x: Int): Boolean {
    if (x<0) return false
    if (x<10) return true
    return x.toString() == x.toString().reversed()
}
