class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
                var hashNums1 = HashMap<Int,Int>()
        var size = 0
        var count = 0

        for(i in 0..nums1.lastIndex){
            if(hashNums1.containsKey(nums1[i])){
                count = hashNums1.get(nums1[i])!!
            }
            hashNums1.put(nums1[i],count+1)
            count=0
        }

        for(i in 0..nums2.lastIndex){
            if(hashNums1.containsKey(nums2[i])){
                count = hashNums1.get(nums2[i])!!
                if (count==1){
                    hashNums1.remove(nums2[i])
                }
                else{
                    hashNums1.put(nums2[i],count-1)
                }
                size++
            }
            else{
                nums2[i]=-1
            }
        }
        var interArr = IntArray(size)
        var interIndex = 0

        for(i in 0..nums2.lastIndex){
            if(nums2[i]!=-1) {
                interArr[interIndex++] = nums2[i]
                println("nums2[$i]: ${nums2[i]}")
            }
        }

        for((key,value) in hashNums1){
            println("key: $key, value: $value")
        }




        return interArr
    }
}