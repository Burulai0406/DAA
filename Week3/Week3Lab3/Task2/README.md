# 2. Intersection of Two Linked Lists

## Problem
Find the node where two linked lists cross each other. If they don't cross, return `null`.

## Approach
1. Start `pointerA` at list A and `pointerB` at list B.
2. Move both pointers forward. When a pointer reaches the end, switch it to the head of the other list.
3. If the lists intersect, both pointers will meet at the intersection node.

## Complexity
- **Time Complexity:** $O(m + n)$
- **Space Complexity:** $O(1)$

## Reflection
The two-pointer method is the most efficient and cleanest way to solve this.
