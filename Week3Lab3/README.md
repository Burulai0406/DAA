
# 2. Intersection of Two Linked Lists

## Problem
Find the node where two linked lists cross each other. If they don't cross, return `null`.

## Approach
We use two pointers to solve this easily without extra memory:
1. Start `pointerA` at the beginning of list A, and `pointerB` at the beginning of list B.
2. Move both pointers one step at a time.
3. When `pointerA` reaches the end (`null`), move it to the start of list B. When `pointerB` reaches the end, move it to the start of list A.
4. If the lists intersect, both pointers will meet at the intersection node. If not, they will both reach `null` at the same time.

## Complexity
- **Time Complexity:** $O(m + n)$ — we go through the lists.
- **Space Complexity:** $O(1)$ — we only use two pointers, no extra space.

## Reflection / Improvement
This two-pointer method is already the best and most efficient way to solve this problem.
