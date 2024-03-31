import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node intersection(Node head1, Node head2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        while (head1 != null) {
            set1.add(head1.data);
            head1 = head1.next;
        }
        while (head2 != null) {
            if (set1.contains(head2.data)) {
                return new Node(head2.data);
            } else {
                set2.add(head2.data);
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Node list1Node1 = new Node(1);
        Node list1Node2 = new Node(2);
        Node list1Node3 = new Node(3);
        list1Node1.next = list1Node2;
        list1Node2.next = list1Node3;

        Node list2Node1 = new Node(3);
        Node list2Node2 = new Node(4);
        Node list2Node3 = new Node(5);
        list2Node1.next = list2Node2;
        list2Node2.next = list2Node3;

        System.out.println(intersection(list1Node1, list2Node1).data);

    }
}
