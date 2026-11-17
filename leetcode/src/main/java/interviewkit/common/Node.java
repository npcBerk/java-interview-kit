package interviewkit.common;

import java.util.ArrayList;
import java.util.List;

/** LeetCode's graph node (e.g. 133. Clone Graph). */
public class Node {
    public int val;
    public List<Node> neighbors;

    public Node() { this(0); }
    public Node(int val) { this(val, new ArrayList<>()); }
    public Node(int val, List<Node> neighbors) { this.val = val; this.neighbors = neighbors; }

    /**
     * Builds a graph from LeetCode's 1-indexed adjacency list notation and returns node 1.
     * of(new int[][] {{2, 4}, {1, 3}, {2, 4}, {1, 3}})
     */
    public static Node of(int[][] adjList) {
        if (adjList.length == 0) return null;
        Node[] nodes = new Node[adjList.length + 1];
        for (int i = 1; i <= adjList.length; i++) nodes[i] = new Node(i);
        for (int i = 1; i <= adjList.length; i++) {
            for (int n : adjList[i - 1]) nodes[i].neighbors.add(nodes[n]);
        }
        return nodes[1];
    }

    @Override
    public String toString() {
        return "Node(" + val + ", neighbors=" + neighbors.stream().map(n -> n.val).toList() + ")";
    }
}
