# First Bad Version

## 1. Problem

You have n versions [1, 2, ..., n] and you want to find out the first bad version using the provided `isBadVersion(version)` API.

## 2. Approach

I solved this using a sequential check:

1. Loop from version 1 up to n.
2. Call `isBadVersion(version)` for each version.
3. Return the first version that returns `true`.

## 3. Time Complexity

**Time Complexity:** O(n)
In the worst case, it calls `isBadVersion` n times, making the runtime linear relative to n.

## 4. Space Complexity

**Space Complexity:** O(1)
It only uses a loop variable, taking constant extra space.

## 5. Reflection / Improvement

- **More efficient approach:** Binary Search.
- **What to change:** Check the mid-point version to eliminate half of the versions in each step.
- **Improved complexity:** O(log n) time complexity.
