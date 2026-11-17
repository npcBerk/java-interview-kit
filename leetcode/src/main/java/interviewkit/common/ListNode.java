package interviewkit.common;

/** LeetCode's singly linked list node. */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    /** [1,2,3] -> 1->2->3 */
    public static ListNode of(int... values) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        for (int v : values) { cur.next = new ListNode(v); cur = cur.next; }
        return dummy.next;
    }

    public static int[] toArray(ListNode head) {
        java.util.List<Integer> out = new java.util.ArrayList<>();
        for (ListNode n = head; n != null; n = n.next) out.add(n.val);
        return out.stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public String toString() { return java.util.Arrays.toString(toArray(this)); }
}
