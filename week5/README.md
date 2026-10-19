# 2. Sort List (LeetCode 148)

## 1. Problem
Given the head of a linked list, return the list after sorting it in ascending order. The solution should run in $O(n \log n)$ time complexity.

## 2. Approach
I implemented the **Merge Sort** algorithm tailored for a singly linked list:
- **Finding the Middle:** Used the fast and slow pointer technique (`slow` moves 1 step, `fast` moves 2 steps) to split the linked list into two halves.
- **Divide:** Recursively split the linked list until sub-lists contain a single element.
- **Conquer (Merge):** Merged the two sorted halves by comparing their node values one by one using a dummy node.

**Tracing Example:**
Input: `4 -> 2 -> 1 -> 3`
1. Split: `4 -> 2` and `1 -> 3`
2. Divide further: `[4]`, `[2]` and `[1]`, `[3]`
3. Merge sub-lists: `2 -> 4` and `1 -> 3`
4. Final merge: `1 -> 2 -> 3 -> 4`

**Challenges Faced:**
A key challenge was disconnecting the split lists properly by setting `mid.next = null`. Forgetting to clear this pointer caused stack overflow errors due to infinite recursion loops.

## 3. Time & Space Complexity
- **Time Complexity:** $O(n \log n)$ — Splitting the list takes $O(\log n)$ recursion depth, and merging nodes at each level takes $O(n)$ time.
- **Space Complexity:** $O(\log n)$ — Caused by the recursion stack frames.

## 4. Reflection / Improvement
- **Is there a more efficient approach?** 
  $O(n \log n)$ is optimal for comparison-based sorting. However, the space complexity can be improved to $O(1)$ by implementing bottom-up (iterative) merge sort instead of recursive merge sort.
