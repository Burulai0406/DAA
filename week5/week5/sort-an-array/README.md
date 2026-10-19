# 1. Sort an Array (LeetCode 912)

## 1. Problem
Given an array of integers `nums`, sort the array in ascending order. The solution should be efficient and use an $O(n \log n)$ time complexity algorithm.

## 2. Approach
I implemented the **Merge Sort** algorithm:
- **Divide:** Split the array recursively into two halves until each sub-array contains a single element.
- **Conquer (Merge):** Merge the divided sub-arrays back together in sorted order.

**Tracing Example:**
Input: `[5, 2, 3, 1]`
1. Split: `[5, 2]` and `[3, 1]`
2. Divide further: `[5]`, `[2]` and `[1]`, `[3]`
3. Merge and sort: `[2, 5]` and `[1, 3]`
4. Final merge: `[1, 2, 3, 5]`

**Challenges Faced:**
Managing correct boundary indices (`left`, `mid`, `right`) during recursion was initially tricky, but careful tracking prevented out-of-bounds errors.

## 3. Time & Space Complexity
- **Time Complexity:** $O(n \log n)$ — The array is split into $\log n$ levels, and merging takes linear time $O(n)$ at each level.
- **Space Complexity:** $O(n)$ — Temporary arrays are allocated for merging sub-arrays.

## 4. Reflection / Improvement
- **Is there a more efficient approach?** 
  QuickSort is another $O(n \log n)$ sorting algorithm that can operate with $O(\log n)$ space complexity, though Merge Sort guarantees stable sorting.
