# 2. Maximum Depth of Binary Tree

## 1. Problem
Find the maximum depth of a binary tree, defined as the number of nodes along the longest path from the root down to the farthest leaf node.

## 2. Approach
We calculate the depth recursively. If the node is null, return 0. Otherwise, return `1 + max(leftDepth, rightDepth)`.

**Tracing Example:**
Tree: `[3, 9, 20, null, null, 15, 7]`
- Leaf nodes `15` and `7` return depth 1.
- Node `20` returns `max(1, 1) + 1 = 2`.
- Root `3` returns `max(1, 2) + 1 = 3`.

## 3. Time Complexity
- **Time Complexity:** $O(N)$ as all nodes are visited.
- **Space Complexity:** $O(H)$ recursion stack depth.

## 4. Reflection / Improvement
Breadth-First Search (BFS) with a queue can also solve this iteratively level-by-level.
