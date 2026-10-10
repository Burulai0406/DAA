# 4. Palindrome Linked List

## Problem

Given the head of a singly linked list, return `true` if it is a palindrome or `false` otherwise.

## Approach

1. Find the middle of the linked list using the fast and slow pointer technique.
2. Reverse the second half of the linked list in-place.
3. Compare the values of the nodes in the first half and the reversed second half.
4. If all values match, return `true`; otherwise, return `false`.

## Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$

## Reflection

In-place reversal of the second half achieves optimal $O(1)$ space complexity without requiring extra data structures like lists or stacks.
