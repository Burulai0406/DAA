# Binary Search

## 1. Problem

Given a sorted array of integers `nums` and an integer `target`, return the index of `target` if it exists, or `-1` otherwise.

## 2. Approach

I solved this problem using Binary Search to achieve O(log n) time complexity:

1. Initialize two pointers: `left = 0` and `right = nums.length - 1`.
2. While `left <= right`, find the middle element `mid`.
3. If `nums[mid] == target`, return `mid`.
4. If `nums[mid] < target`, search the right half by setting `left = mid + 1`.
5. If `nums[mid] > target`, search the left half by setting `right = mid - 1`.
6. Return `-1` if target is not found.

## 3. Time Complexity

**Time Complexity:** O(log n)
The search space is divided in half during each step, resulting in logarithmic time complexity.

## 4. Space Complexity

**Space Complexity:** O(1)
The algorithm uses a constant amount of extra space for pointer variables.

## 5. Reflection / Improvement

- Binary Search is optimal for searching in sorted arrays.
- Be careful with integer overflow when calculating `mid`; using `left + (right - left) / 2` prevents overflow.
