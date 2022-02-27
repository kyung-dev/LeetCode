class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var sum = nums[0]
        val arrLen = nums.size
        
        for(i in 1..arrLen-1){
            sum+=nums[i]
            if(nums[i]>sum) sum = nums[i]
            nums[i] = if(sum > nums[i-1])sum else nums[i-1]
        }
        return nums[arrLen-1]
    }
}