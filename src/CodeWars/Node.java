package CodeWars;

/**
 * Created by wangweimin on 16/5/12.
 */
public class Node {
    private Node next;

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    public static Node createChain(int tailLength, int loop) {
        Node head = new Node();
        Node tail = head;
        for (int i = 0; i < tailLength; i++) {
            Node node = new Node();
            tail.setNext(node);
            tail = node;
        }

        Node loopHead = new Node();
        Node loopTail = loopHead;
        for (int i = 1; i < loop; i++) {
            Node node = new Node();
            loopTail.setNext(node);
            loopTail = node;
        }

        loopTail.setNext(loopHead);
        tail.setNext(loopHead);
        return head;
    }
}
