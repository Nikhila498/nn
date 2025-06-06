import java.util.*;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Main{
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node curr = head;
        while (curr != null) {
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        curr = head;
        Node copyHead = head.next;
        Node copyCurr = copyHead;
        while (curr != null) {
            curr.next = curr.next.next;
            copyCurr.next = (copyCurr.next != null) ? copyCurr.next.next : null;
            curr = curr.next;
            copyCurr = copyCurr.next;
        }

        return copyHead;
    }

    
    public Node buildList(int[][] arr) {
        if (arr.length == 0) return null;

        Node[] nodes = new Node[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nodes[i] = new Node(arr[i][0]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                nodes[i].next = nodes[i + 1];
            }
            int randIndex = arr[i][1];
            nodes[i].random = (randIndex == -1) ? null : nodes[randIndex];
        }
        return nodes[0];
    }


    public int[][] serializeList(Node head) {
        List<Node> nodeList = new ArrayList<>();
        Map<Node, Integer> nodeToIndex = new HashMap<>();
        Node curr = head;
        int idx = 0;
        while (curr != null) {
            nodeList.add(curr);
            nodeToIndex.put(curr, idx++);
            curr = curr.next;
        }

        int[][] result = new int[nodeList.size()][2];
        for (int i = 0; i < nodeList.size(); i++) {
            Node node = nodeList.get(i);
            result[i][0] = node.val;
            result[i][1] = (node.random == null) ? -1 : nodeToIndex.get(node.random);
        }
        return result;
    }

    
    public void printList(int[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i][0] + "," + (arr[i][1] == -1 ? "null" : arr[i][1]) + "]");
            if (i != arr.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Main solution = new Main();

        int[][] input1 = { {7,-1}, {13,0}, {11,4}, {10,2}, {1,0} };
        Node head1 = solution.buildList(input1);
        Node copied1 = solution.copyRandomList(head1);
        int[][] output1 = solution.serializeList(copied1);
        solution.printList(output1);
        

        int[][] input2 = { {1,1}, {2,1} };
        Node head2 = solution.buildList(input2);
        Node copied2 = solution.copyRandomList(head2);
        int[][] output2 = solution.serializeList(copied2);
        solution.printList(output2);
        

        int[][] input3 = { {3,-1}, {3,0}, {3,-1} };
        Node head3 = solution.buildList(input3);
        Node copied3 = solution.copyRandomList(head3);
        int[][] output3 = solution.serializeList(copied3);
        solution.printList(output3);
    
    }
}