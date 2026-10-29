# 4. Path Sum

## 1. Problem
Determine if the tree has a root-to-leaf path such that adding up all values equals `targetSum`.

## 2. Approach
Subtract the current node's value from `targetSum` as we traverse down. At leaf nodes, check if the remaining sum equals the node's value.

## 3. Time Complexity
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(H)$

## 4. Reflection / Improvement
An iterative stack-based approach can avoid deep recursion overhead.
