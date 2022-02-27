<h2><a href="https://leetcode.com/problems/maximum-subarray/">53. Maximum Subarray</a></h2><h3>Easy</h3><hr><div><p>Given an integer array <code>nums</code>, find the contiguous subarray (containing at least one number) which has the largest sum and return <em>its sum</em>.</p>

<p>A <strong>subarray</strong> is a <strong>contiguous</strong> part of an array.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [-2,1,-3,4,-1,2,1,-5,4]
<strong>Output:</strong> 6
<strong>Explanation:</strong> [4,-1,2,1] has the largest sum = 6.
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1]
<strong>Output:</strong> 1
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [5,4,-1,7,8]
<strong>Output:</strong> 23
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> If you have figured out the <code>O(n)</code> solution, try coding another solution using the <strong>divide and conquer</strong> approach, which is more subtle.</p>
</div>

<hr>
<p><strong>resolution</strong></p>
<p>메모이제이션 사용 : 메모이제이션(memoization)은 컴퓨터 프로그램이 동일한 계산을 반복해야 할 때, 이전에 계산한 값을 메모리에 저장함으로써 동일한 계산의 반복 수행을 제거하여 프로그램 실행 속도를 빠르게 하는 기술</p>
<img width="937" alt="스크린샷 2022-02-27 오후 3 13 36" src="https://user-images.githubusercontent.com/71361688/155870704-536ac99b-ef8b-40e7-9c8b-0c30d02cd731.png">
<p>1. sum에 nums[i]값을 더한다</p>
<p>2. sum보다 nums[i]값이 크면 sum에 대입한다. (i까지의 부분합보다 nums[i]값이 크다면 i부터 부분합을 다시 시작한다.)</p>
<p>3. nums[i-1]과 sum 중에 큰 값을 nums[i]에 대입한다. (nums[i]에는 해당 인덱스까지 최대부분합을 기록한다)</p>
