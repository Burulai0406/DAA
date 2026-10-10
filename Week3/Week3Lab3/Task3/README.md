# 3. Remove Linked List Elements

## Problem
Given the head of a linked list and an integer `val`, remove all the nodes of the linked list that has `Node.val == val`, and return the new head.

## Approach
1. Create a `dummy` node pointing to the `head` to safely handle cases where the head node itself must be removed.
2. Initialize a pointer `current` at the `dummy` node.
3. Traverse the list: if `current.next.val` equals the target value, bypass it (`current.next = current.next.next`). Otherwise, move `current` forward.
4. Return `dummy.next` as the new head.

## Complexity
- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$

## Reflection
Using a dummy node simplifies the logic by avoiding special checks for the head node.
