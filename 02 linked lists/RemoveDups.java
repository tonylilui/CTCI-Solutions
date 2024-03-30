import java.util.HashMap;
import java.util.HashSet;

public class RemoveDups {
    public static void removeDups(Node node) {
        HashSet<Integer> set = new HashSet<Integer>();
        Node previous = null;
        while (node != null) {
            if (!set.contains(node.data)) { // never seen before
                set.add(node.data);
                previous = node;
            } else {
                // that means theres a duplicate, we should delete the node
                previous.next = node.next;
            }
            node = node.next;
        }

    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(3);
        Node node4 = new Node(5);
        Node node5 = new Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        removeDups(node1);
        while (node1 != null) {
            System.out.println(node1.data + " ");
            node1 = node1.next;
        }
    }

    public static class Node {
        Node next = null;
        int data;

        public Node(int d) {
            data = d;
        }
    }
}