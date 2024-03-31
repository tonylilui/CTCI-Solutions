public class Palindrome {
    public static class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
        }
    }

    public static boolean palindrome(Node head) {
        Node previous = null;
        Node head2 = head;
        String original = "";
        String reversed = "";
        while (head != null) {
            original += head.data;
            head = head.next;
        }
        head = head2;
        while (head != null) {
            Node nextTemp = head.next;
            head.next = previous;
            previous = head;
            head = nextTemp;
        }
        while (previous != null) {
            reversed += previous.data;
            previous = previous.next;
        }
        System.out.println(original);
        System.out.println(reversed);
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        Node node1 = new Node('a');
        Node node2 = new Node('b');
        Node node3 = new Node('c');
        node1.next = node2;
        node2.next = node3;
        System.out.println(palindrome(node1));
    }
}
