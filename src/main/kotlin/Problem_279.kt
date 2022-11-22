fun main(){
 print(numSquares(12))
}
fun numSquares(n: Int): Int {
//    if(n%9 == 0) return (n/9).toInt()
//    if(n%16 == 0) return (n/16).toInt()
//     if (n%4 == 0) return (n/4).toInt()
//     else{
//         var son=0
//         var m = (n/4)
//         if (m*4<n){
//          var m1 = m*4 + 9
//             for (i in m1..n step 9) {
//                 var m2 = m*4 +i
//                 if (m2<=n){
//                     son += 1
//                 }
//                 else{
//                 }
//             }
//             return m+son
//         }
//     }
//    return 0
    if(n%9 == 0) return (n/9).toInt()
    if(n == 1 || n<4) return n/1
    if(n%16 == 0) return (n/16).toInt()
    if (n%4 == 0) return (n/4).toInt()
    else{
        if(4+9==n){
            return 2
        }
        else return 0
    }
    return 0
}