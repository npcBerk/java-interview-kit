package interviewkit.common;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/** LeetCode's binary tree node. */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }

    /** Level-order notation, as on LeetCode: of(3, 9, 20, null, null, 15, 7) */
    public static TreeNode of(Integer... values) {
        if (values.length == 0 || values[0] == null) return null;
        TreeNode root = new TreeNode(values[0]);
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode node = queue.poll();
            if (i < values.length && values[i] != null) { node.left = new TreeNode(values[i]); queue.add(node.left); }
            i++;
            if (i < values.length && values[i] != null) { node.right = new TreeNode(values[i]); queue.add(node.right); }
            i++;
        }
        return root;
    }

    /** Inverse of of(...); trailing nulls are dropped. */
    public static List<Integer> toList(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        Deque<TreeNode> queue = new java.util.LinkedList<>(); // accepts nulls
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) { out.add(null); continue; }
            out.add(node.val);
            queue.add(node.left);
            queue.add(node.right);
        }
        while (!out.isEmpty() && out.get(out.size() - 1) == null) out.remove(out.size() - 1);
        return out;
    }

    @Override
    public String toString() { return toList(this).toString(); }
}
