# 3. Minimum Depth of Binary Tree

## 1. Problem
Find the minimum depth, which is the shortest path from the root down to the nearest leaf node.

## 2. Approach
Recursively find the minimum depth. Special care must be taken if one child is null: a node with only one child is not a leaf, so we must traverse the non-null child.

**Challenges Faced:**
Returning 0 for a null child incorrectly treated nodes with one missing child as leaves. Handling edge cases for single-child nodes solved this.

## 3. Time Complexity
- **Time Complexity:** $O(N)$ worst case.
- **Space Complexity:** $O(H)$ recursion stack.

## 4. Reflection / Improvement
BFS approach is optimal here because it halts immediately upon hitting the first leaf node.
