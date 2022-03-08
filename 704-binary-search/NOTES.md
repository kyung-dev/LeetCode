​<p><strong>​My Solution</strong></p>

<ul>
	<li>과정
      <ol type="1">
    <li>endP==0 && nums[endP]==target 이면 0 반환</li>
    <li>검색할 범위가 0보다 크면 반복</li>
    <li>index위치 값이 target이면  Index 반환, target보다 크면 endP에 index-1 대입, 작으면 startP에 index+1 대입</li>
    <li>반복할 때마다 term은 검색영역의 2/1, index는 startP+term</li>
    <li>startP==endP && nums[startP]==target 이면 startP 반환</li>
    <li>반복 끝나면 -1 반환</li>
  </ol>
  </li>
</ul>

​<p><strong>Better Solution</strong></p>


<pre><code>class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left: Int = 0
        var right: Int = nums.size - 1
        
        while(left <= right) {
            var middle: Int = (left + right)
            if(nums[middle] == target) return middle
            else if(nums[middle] > target) right = middle - 1
            else left = middle + 1
        }
        return -1
    }
  }</code></pre>
  
  <p>reference: <a href="https://leetcode.com/problems/binary-search/discuss/1615948/Kotlin-Binary-Search"> other discuss</a></p>
