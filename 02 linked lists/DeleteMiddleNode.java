public class DeleteMiddleNode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void deleteNodeMiddle(Node head) {
        Node headTemp = head;
        int size = 0;
        while (head != null) {
            head = head.next;
            size += 1;
        }
        int middle = size / 2;
        head = headTemp;
        for (int i = 0; i < middle - 1; i++) {
            head = head.next;
        }
        head.next = head.next.next;

    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        deleteNodeMiddle(node1);
        while (node1 != null) {
            System.out.println(node1.data);
            node1 = node1.next;
        }
    }
}
