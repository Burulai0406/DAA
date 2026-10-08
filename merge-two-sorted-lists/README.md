# Merge Two Sorted Lists

## 1. Problem

We are given two sorted linked lists. We need to merge them into one sorted linked list.

For example:

```text
List 1: 1 → 3 → 5
List 2: 2 → 4 → 6

Result: 1 → 2 → 3 → 4 → 5 → 6
```

## 2. Approach

I compare the current nodes of the two lists.

If `list1.val` is smaller, I add `list1` to the result and move `list1` to the next node.

Otherwise, I add `list2` and move `list2` to the next node.

I repeat this while both lists have nodes.

When one list becomes empty, I add the remaining part of the other list.

### Tracing

```text
List 1: 1 → 3 → 5
List 2: 2 → 4 → 6

1 vs 2 → take 1
3 vs 2 → take 2
3 vs 4 → take 3
5 vs 4 → take 4
5 vs 6 → take 5
List 1 is empty → take 6

Result: 1 → 2 → 3 → 4 → 5 → 6
```

## 3. Time Complexity

**Time Complexity: O(n + m)**

There are `n` nodes in the first list and `m` nodes in the second list. Each node is processed at most once.

## 4. Space Complexity

**Space Complexity: O(1)**

The algorithm does not create another list or array. It only uses a few pointer variables.

## 5. Reflection / Improvement

The solution already has optimal time complexity of `O(n + m)` because we need to examine the nodes to merge the lists.

The extra space is also efficient because it uses `O(1)` additional space.

A different approach could create a new linked list, but that would require `O(n + m)` extra space.
