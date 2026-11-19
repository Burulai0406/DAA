# Convert Sorted Array to Binary Search Tree

## 1. Problem
Given a sorted array `nums` in increasing order, I need to build a height-balanced BST from it. Height-balanced means for every node, the left and right subtree heights differ by at most 1.

## 2. Approach
Since the array is already sorted, picking the middle element as the root keeps about half the numbers on the left and half on the right.
- Base case: if `left > right`, return `null`.
- Find `mid = left + (right - left) / 2` and make `new TreeNode(nums[mid])`.
- Recursively build the left side with `(left, mid - 1)` and the right side with `(mid + 1, right)`.

### Trace
`nums = [-10, -3, 0, 5, 9]`, indices `0` to `4`.
- `build(0, 4)`: `mid = 2`, value `0` becomes root. Left range `(0, 1)`, right range `(3, 4)`.
- `build(0, 1)`: `mid = 0`, value `-10`. `(0, -1)` returns `null`, `(1, 1)` makes node `-3`. So `-10` has right child `-3`.
- `build(3, 4)`: `mid = 3`, value `5`. `(3, 2)` returns `null`, `(4, 4)` makes node `9`. So `5` has right child `9`.
- Root is `0`, left has `-10` -> `-3`, right has `5` -> `9`.

### Problems I ran into
- If you always pick the first element as root, you get a skewed tree instead of a balanced one.
- Using `(left + right) / 2` can overflow `int` in Java if `left + right` gets too big, so `left + (right - left) / 2` is safer.

## 3. Time and Space Complexity
- Time Complexity: O(n), where n is the length of `nums`. Every element is used once to create a node, and each step does constant work.
- Space Complexity: O(log n) for the recursion call stack (not counting the output tree of n nodes), because splitting in half keeps the recursion depth logarithmic.

## 4. Reflection / Improvement
- Is there a better approach? O(n) time is already optimal since every number has to go into the tree.
- What would I change? The midpoint recursion is already straightforward; you could write it iteratively with a stack if you wanted, though it's more code.
- What complexity could it get? O(n) time and O(log n) auxiliary stack space (plus O(n) for the tree itself).