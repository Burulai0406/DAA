# 10. Merge Two Binary Trees

## 1. Problem
Merge two binary trees by overlapping nodes and summing their values.

## 2. Approach
If one node is null, return the other. If both exist, sum their values into a new node and recursively merge their left and right children.

## 3. Time Complexity
- **Time Complexity:** $O(M)$ where $M$ is the minimum number of overlapping nodes.
- **Space Complexity:** $O(H)$

## 4. Reflection / Improvement
Modifying `root1` in-place would save auxiliary memory allocation.
