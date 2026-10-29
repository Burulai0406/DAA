# 1. Binary Tree Inorder Traversal

## 1. Problem
Given the root of a binary tree, return the inorder traversal of its nodes' values (Left -> Root -> Right).

## 2. Approach
We use a recursive Depth-First Search (DFS) approach. Inorder traversal visits the left subtree first, then the current node, and finally the right subtree.

**Tracing Example:**
Tree: `[1, null, 2, 3]`
- Call `helper(1)`: Recurse left (null). Append `1`. Recurse right to node `2`.
- Call `helper(2)`: Recurse left to node `3`.
- Call `helper(3)`: Recurse left (null). Append `3`. Recurse right (null).
- Back to `2`: Append `2`.

**Challenges Faced:**
Handling null pointers manually in an iterative stack approach caused issues, so recursion was chosen for clarity.

## 3. Time Complexity
- **Time Complexity:** $O(N)$ because every node is visited exactly once.
- **Space Complexity:** $O(H)$ where $H$ is the height of the tree due to the recursion stack.

## 4. Reflection / Improvement
An iterative approach using a Stack or Morris Traversal can reduce auxiliary space.
