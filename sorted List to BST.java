public class Main {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    private static ListNode findMiddle(ListNode head) {
        ListNode prevPtr = null;
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            prevPtr = slowPtr;
            slowPtr = slowPtr.next;
        }
        if (prevPtr != null) {
            prevPtr.next = null;
        }

        return slowPtr;
    }
    public static TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode mid = findMiddle(head);
        TreeNode node = new TreeNode(mid.val);
        if (head == mid) {
            return node;
        }
        node.left = sortedListToBST(head);
        node.right = sortedListToBST(mid.next);

        return node;
    }

    
    public static void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        
        ListNode head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);

        TreeNode root = sortedListToBST(head);
        System.out.print("Pre-order Traversal of the BST: ");
        preOrder(root);
        System.out.println();
    }
}