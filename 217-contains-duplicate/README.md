<h2><a href="https://leetcode.com/problems/contains-duplicate/">217. Contains Duplicate</a></h2><h3>Easy</h3><hr><div><p>Given an integer array <code>nums</code>, return <code>true</code> if any value appears <strong>at least twice</strong> in the array, and return <code>false</code> if every element is distinct.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,3,1]
<strong>Output:</strong> true
</pre><p><strong>Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,3,4]
<strong>Output:</strong> false
</pre><p><strong>Example 3:</strong></p>
<pre><strong>Input:</strong> nums = [1,1,1,3,3,4,3,2,4,2]
<strong>Output:</strong> true
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
</ul>
</div>

<hr>
<p><strong>resolution</strong></p>
<p>이중 <code>for</code>문을 사용합니다. 첫 번째 <code>for</code>문은 배열 하나하나에 접근하고 두 번째 <code>for</code>문은 해당 인덱스 이후의 값과 비교하여 같은 값이면 <code>true</code>를 반환 합니다. <code>for</code>문이 끝나면 false를 반환합니다.
