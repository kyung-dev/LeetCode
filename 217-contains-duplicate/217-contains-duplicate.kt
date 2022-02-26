class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numsLen = nums.size
        for(num in 0..(numsLen-2)){
            for(index in (num+1)..(numsLen-1)){
                if(nums[num]==nums[index]) return true
            }
        }
        return false
    }
}