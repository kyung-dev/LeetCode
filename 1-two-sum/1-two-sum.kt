class Solution {
 fun twoSum(nums: IntArray, target: Int): IntArray {
            val numsIndex = nums.size - 1
            val indices = IntArray(2) { -1 }
            var hashMap = HashMap<Int,Int>()

            for(i in 0..numsIndex){
                if(hashMap.containsKey(target-nums[i])){
                    indices[0]= hashMap.get(target-nums[i])!!
                    indices[1]=i
                }
                hashMap.put(nums[i],i)

            }

            println("i: ${indices[0]}, j: ${indices[1]}")
            return indices
        }
}