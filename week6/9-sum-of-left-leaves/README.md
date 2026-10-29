# 9. Sum of Left Leaves

## 1. Problem
Find the sum of all left leaves in a binary tree.

## 2. Approach
Check if the left child of the current node exists and is a leaf node. If so, include its value in the sum and recursively check both subtrees.

## 3. Time Complexity
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(H)$

## 4. Reflection / Improvement
Passing an explicit boolean flag to indicate if a node is a left child simplifies logic.
