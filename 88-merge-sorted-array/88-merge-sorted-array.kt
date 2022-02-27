class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var mp = m-1
        var np = n-1
        for(i in 0..nums1.lastIndex){
            println("mp: $mp, np: $np, lastIndex-i: ${nums1.lastIndex-i}")
            if(np>=0&&mp>=0)
                nums1[nums1.lastIndex-i]=if(nums1[mp]>nums2[np])nums1[mp--]else nums2[np--]
            else if(mp<0)
                nums1[nums1.lastIndex-i] = nums2[np--]
            else if(np<0)
                nums1[nums1.lastIndex-i] = nums1[mp--]
        }
    }
}