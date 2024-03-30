public class ReturnKthToLast {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int returnKthToLast(Node head, int k) {
        int size = 0;
        Node startTrack = head;
        while (head != null) {
            head = head.next;
            size++;
        }
        head = startTrack;
        for (int i = 0; i < size - k - 1; i++) {
            head = head.next;
        }
        return head.data;

    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        System.out.println(returnKthToLast(node1, 2));
    }
}
