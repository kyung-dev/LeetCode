class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var startP = 0
        var endP = nums.lastIndex
        var term = (endP-startP)/2
        var index = startP+term
        if(endP==0&&nums[endP]==target) return 0

        while ((endP-startP)>0){

            if(nums[index]==target) return index
            else if(nums[index]>target) endP = index-1
            else if(nums[index]<target) startP = index+1
            term=(endP-startP)/2
            index=startP+term
            if(startP==endP&&nums[startP]==target) return startP
        }
        return -1
    }
}