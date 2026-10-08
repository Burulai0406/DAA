# Linked List Cycle

## 1. Problem

We are given a linked list. We need to check whether the linked list contains a cycle.

A cycle exists when a node points back to a previous node instead of pointing to `null`.

For example:

```text
1 → 2 → 3 → 4
    ↑       ↓
    ← ← ← ←
```

In this case, the result is `true`.

If the list is:

```text
1 → 2 → 3 → null
```

there is no cycle, so the result is `false`.

## 2. Approach

I use a `HashSet` to store the nodes that I have already visited.

For every node, I first check if it is already in the set.

- If it is already there, a cycle exists, so I return `true`.
- If it is not there, I add it to the set and move to the next node.

If I reach `null`, there is no cycle, so I return `false`.

### Tracing

For example:

```text
1 → 2 → 3 → 2
```

Steps:

```text
1 → add to HashSet
2 → add to HashSet
3 → add to HashSet
2 → already exists in HashSet → cycle found
```

Result:

```text
true
```

For a list without a cycle:

```text
1 → 2 → 3 → null
```

Steps:

```text
1 → add
2 → add
3 → add
null → stop
```

Result:

```text
false
```

## 3. Time Complexity

**Time Complexity: O(n)**

We visit each node at most once. Therefore, if there are `n` nodes, the algorithm takes `O(n)` time.

## 4. Space Complexity

**Space Complexity: O(n)**

The `HashSet` stores the visited nodes. In the worst case, it can contain all `n` nodes.

## 5. Reflection / Improvement

There is a more space-efficient solution called Floyd's Cycle Detection Algorithm.

It uses two pointers: `slow` and `fast`.

The time complexity remains `O(n)`, but the space complexity becomes `O(1)` because it does not need a `HashSet`.

My current solution is easier to understand, but Floyd's algorithm uses less additional memory.
