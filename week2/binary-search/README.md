# Binary Search

## 1. Problem

Given a sorted array of integers `nums` and an integer `target`, return the index of `target` if it exists, or `-1` otherwise.

## 2. Approach

I solved this problem using Linear Search.

1. Iterate through the array using a `for` loop.
2. Compare each element with the `target`.
3. If a match is found, return its index.
4. If the loop completes without finding `target`, return `-1`.

## 3. Time Complexity

**Time Complexity:** O(n)
In the worst case, the target is at the end or not present. The algorithm checks all n elements, so time complexity grows linearly with n.

## 4. Space Complexity

**Space Complexity:** O(1)
The algorithm uses a single variable `i`, which requires a constant amount of extra memory.

## 5. Reflection / Improvement

- **More efficient approach:** Binary Search.
- **What to change:** Divide the search range in half each step by comparing `target` with the middle element.
- **Improved complexity:** O(log n) time complexity.
