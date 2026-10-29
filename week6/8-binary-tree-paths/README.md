# 8. Binary Tree Paths

## 1. Problem
Return all root-to-leaf paths in a binary tree.

## 2. Approach
Recursively append node values to a path string. When a leaf is reached, add the string to the result list.

## 3. Time Complexity
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(H)$

## 4. Reflection / Improvement
Using `StringBuilder` reduces string creation overhead.
