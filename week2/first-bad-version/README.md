# First Bad Version

## 1. Problem

You have n versions [1, 2, ..., n] and you want to find out the first bad version using the provided `isBadVersion(version)` API.

## 2. Approach

I solved this problem using Binary Search to minimize API calls:

1. Set pointers `left = 1` and `right = n`.
2. Compute `mid = left + (right - left) / 2`.
3. If `isBadVersion(mid)` is true, the first bad version is at `mid` or to its left, so set `right = mid`.
4. If `isBadVersion(mid)` is false, the first bad version must be to the right, so set `left = mid + 1`.
5. When `left == right`, return `left`.

## 3. Time Complexity

**Time Complexity:** O(log n)
Binary search reduces the search space by half at each iteration, minimizing `isBadVersion` calls.

## 4. Space Complexity

**Space Complexity:** O(1)
It uses iterative binary search requiring constant memory.

## 5. Reflection / Improvement

- Using binary search avoids unnecessary API calls compared to a linear scan.
- Setting `right = mid` (instead of `mid - 1`) ensures we don't skip a potential first bad version.
