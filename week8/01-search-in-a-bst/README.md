# Search in a Binary Search Tree

## 1. Problem
We get a BST and a target number `val`. I need to find the node with `val` and return that node (along with its children), or `null` if it is not in the tree.

## 2. Approach
I start at `root` with a pointer `current` and use a `while` loop instead of recursion.
- If `current.val == val`, I found it and return `current`.
- If `val < current.val`, I go left (`current = current.left`) because smaller numbers are on the left in a BST.
- If `val > current.val`, I go right (`current = current.right`) because bigger numbers are on the right.
- If `current` becomes `null`, the number isn't there, so I return `null`.

### Trace
Tree: root `4`, left `2` (children `1`, `3`), right `7`. Target `val = 2`.
- Step 1: `current` is `4`. `2 < 4`, so move to `2`.
- Step 2: `current` is `2`. `2 == 2`, return node `2`.

If `val = 5`:
- Step 1: `current` is `4`. `5 > 4`, move to `7`.
- Step 2: `current` is `7`. `5 < 7`, move to `7.left` which is `null`.
- Loop stops and returns `null`.

### Problems I ran into
- At first I thought about checking both left and right like a normal binary tree, which misses the point of a BST.
- Also had to make sure `current != null` is checked first so it doesn't crash on `null`.

## 3. Time and Space Complexity
- Time Complexity: O(h), where h is the height of the tree. In a balanced tree it's O(log n), and if the tree is one long line (skewed) it's O(n). We only visit one node per level.
- Space Complexity: O(1), because I only use the `current` variable and no extra data structures or recursion stack.

## 4. Reflection / Improvement
- Is there a better approach? Not really in big-O time for the worst case, since a skewed tree still has to be walked down.
- What would I change? If I wanted a recursive version I could write that, or use a self-balancing tree if I needed guaranteed O(log n) height.
- What complexity could it get? Still O(h) time; recursion would use O(h) stack space instead of O(1).