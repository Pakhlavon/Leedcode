
fun main(args: Array<String>){
    print(twoSum(intArrayOf(1,2,4,5),9))
}
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for(i in 0 until nums.size){
        if(target-nums[i] in map){
            return intArrayOf(map[target-nums[i]]!!,i)
        }
        else{
            map[nums[i]]=i
        }
    }
    return intArrayOf()
}