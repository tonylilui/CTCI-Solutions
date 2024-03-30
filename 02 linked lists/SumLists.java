public class SumLists {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void sumLists(Node head1, Node head2) {
        int sum = 0;
        int base = 1;
        while (head1 != null) {
            sum += head1.data * base + head2.data * base;
            base = base * 10;

            head1 = head1.next;
            head2 = head2.next;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Node num1Node1 = new Node(1);
        Node num1Node2 = new Node(2);
        Node num1Node3 = new Node(6);
        num1Node1.next = num1Node2;
        num1Node2.next = num1Node3;

        Node num2Node1 = new Node(4);
        Node num2Node2 = new Node(5);
        Node num2Node3 = new Node(6);
        num2Node1.next = num2Node2;
        num2Node2.next = num2Node3;
        sumLists(num1Node1, num2Node1);
    }
}
