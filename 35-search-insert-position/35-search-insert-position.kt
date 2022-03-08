class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var startP = 0
        var endP = nums.lastIndex
        var size = nums.size
        var term = size/2
        var index = startP+term
        
        while(size>0){
            if(nums[index]==target) return index
            else if(nums[index]>target) endP = index - 1
            else startP = index + 1
            
            if (size==1) {
                if (nums[index]>target) return index
                else return index+1
            }
            
            size = endP-startP+1
            term = size/2
            index = startP + term
        }
        
        return index
    }
}