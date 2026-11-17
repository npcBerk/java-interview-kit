// import interviewkit.common.ListNode;
// import interviewkit.common.TreeNode;

import java.util.*;

/**
 * Free playground. Use it to try an idea, an API (PriorityQueue, TreeMap...) or a piece of a
 * solution. Run it with: ./lc try
 *
 * To keep an experiment, save it as its own file in this folder
 * (e.g. playground/TreeMapFloorCeiling.java) and run: ./lc try playground/TreeMapFloorCeiling.java
 */
public class Scratch {
    public static void main(String[] args) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.add(new int[] {3, 1});
        pq.add(new int[] {1, 2});
        while (!pq.isEmpty()) System.out.println(Arrays.toString(pq.poll()));

        // System.out.println(ListNode.of(1, 2, 3));
        // System.out.println(TreeNode.of(3, 9, 20, null, null, 15, 7));
    }
}
