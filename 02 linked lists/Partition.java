public class Partition {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node partition(Node node, int x) {
        Node left = new Node(0);
        Node leftHead = left;
        Node right = new Node(0);
        Node rightHead = right;

        while (node != null) {
            if (node.data < x) {
                left.next = node;
                left = left.next;
            } else {
                right.next = node;
                right = right.next;
            }
            node = node.next;
        }

        right.next = null;
        left.next = rightHead.next;
        return leftHead.next;
    }

    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(1);
        Node node4 = new Node(2);
        Node node5 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node1 = partition(node1, 3);
        while (node1 != null) {
            System.out.println(node1.data);
            node1 = node1.next;
        }
    }
}
