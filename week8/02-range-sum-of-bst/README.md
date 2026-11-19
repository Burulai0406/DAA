# Range Sum of BST

## 1. Problem
We have a BST and two numbers `low` and `high`. I need to add up the values of all nodes that are between `low` and `high` (including `low` and `high`).

## 2. Approach
I use recursion to walk through the tree and add matching values to `sum`.
- If `root == null`, return `0`.
- If `root.val >= low && root.val <= high`, add `root.val` to `sum`.
- Only go left if `root.val > low` (if `root.val` is already `<= low`, left children are even smaller so they won't be in range).
- Only go right if `root.val < high` (same idea for bigger numbers on the right).

### Trace
Tree: root `10`, left `5` (children `3`, `7`), right `15` (right child `18`). `low = 7`, `high = 15`.
- At `10`: in range `[7, 15]`, so `sum` starts with `10`. `10 > 7` so check left, `10 < 15` so check right.
- At `5`: not in range. `5 > 7` is false so I skip `3`, `5 < 15` is true so I check `7`.
- At `7`: in range, add `7`. Right is `null`.
- At `15`: in range, add `15`. `15 < 15` is false so I skip `18`.
- Total sum: `10 + 7 + 15 = 32`.

### Problems I ran into
- My first idea was just visiting every single node in the tree, which works but wastes time on branches that are out of range.
- Almost wrote `>` and `<` instead of `>=` and `<=`, which would skip `low` and `high` when they are in the tree.

## 3. Time and Space Complexity
- Time Complexity: O(n) in the worst case, where n is the number of nodes. If most nodes are in range, we end up visiting almost all of them. When we skip branches, it does less work in practice.
- Space Complexity: O(h) for the recursion stack, where h is the height of the tree (O(log n) if balanced, O(n) if skewed).

## 4. Reflection / Improvement
- Is there a better approach? An iterative solution with a stack (`ArrayDeque`) can do the same thing without recursion.
- What would I change? Use a loop and push left/right nodes onto a stack using the same `low` and `high` checks.
- What complexity could it get? Still O(n) worst-case time and O(h) space for the stack.