# 1. Remove Duplicates from Sorted List

## Problem
Given the head of a sorted linked list, delete duplicates so each element appears only once.

## Approach
1. Start a pointer `current` at the `head`.
2. Compare `current.val` with `current.next.val`.
3. If they are equal, skip the next node (`current.next = current.next.next`).
4. If not, move to the next node (`current = current.next`).

## Complexity
- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$

## Reflection
This is an optimal in-place solution.
