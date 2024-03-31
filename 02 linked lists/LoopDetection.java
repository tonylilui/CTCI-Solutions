import java.util.HashSet;;

public class LoopDetection {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node loopDetection(Node head) {
        HashSet<Node> set = new HashSet<Node>();
        while (head != null) {
            if (head.next != null && set.contains(head.next)) {
                return head;
            } else {
                set.add(head);
            }
            head = head.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        System.out.println(loopDetection(node1).data);
    }
}
