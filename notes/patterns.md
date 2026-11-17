# Pattern cheat sheet

Signals in the problem statement that point to a pattern. Add your own as you go.

| Pattern | Reach for it when… | Typical complexity |
| --- | --- | --- |
| hashing | you need "have I seen this before?" or counts in O(1) | O(n) time, O(n) space |
| twopointers | the input is sorted, or you compare both ends of an array or string | O(n) |
| slidingwindow | "longest / shortest contiguous subarray or substring such that…" | O(n) |
| stack | matching brackets, "next greater element", undo-style processing | O(n) |
| binarysearch | sorted input, or "minimum X such that a condition holds" (search on the answer) | O(log n) or O(n log M) |
| linkedlist | in-place pointer rewiring; fast/slow pointers for cycles and middles | O(n), O(1) space |
| trees | recursion on left/right subtrees; BFS for anything "level by level" | O(n) |
| heap | "top k", "k-th largest", always processing the smallest/largest next | O(n log k) |
| graph | grids, dependencies, connectivity: BFS (shortest steps), DFS, topological sort, union-find | O(V + E) |
| intervals | overlapping ranges: sort by start (merge) or by end (greedy selection) | O(n log n) |
| dp | "number of ways", "min/max cost", choices that reuse smaller answers | O(states × transitions) |
| greedy | a local best choice provably never hurts; often after sorting | O(n log n) |
| backtracking | "all combinations / permutations / subsets", word search on a board | exponential |
| bit | XOR tricks, counting bits, sums without `+` | O(1) to O(n) |
| design | implement a class (Trie, codec, data stream) with several operations | per operation |
