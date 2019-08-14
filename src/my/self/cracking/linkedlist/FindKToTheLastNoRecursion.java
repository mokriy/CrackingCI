package my.self.cracking.linkedlist;

public class FindKToTheLastNoRecursion {

    private static Node start;

    public static void main(String[] args) {
        int k = Integer.valueOf(args[0]);

        Node linkedList = null;
        for (int i = 0; i <= 9; i++) {
            if (linkedList == null) {
                linkedList = new Node(i);
                start = linkedList;
            } else {
                linkedList.next = new Node(i);
                linkedList = linkedList.next;
            }
        }

        System.out.println(findKBeforeLast(k));

    }

    private static Node findKBeforeLast(int k) {
        Node kPointer = start;
        Node lastPointer = start;
        int step = 0;
        while (lastPointer != null) {
            if (step > k) {
                kPointer = kPointer.next;
            }
            lastPointer = lastPointer.next;
            step++;
        }
        return kPointer;
    }


    private static class Node {

        private int id;
        private Node next;

        Node(int id) {
            this.id = id;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "id=" + id +
                    '}';
        }
    }
}
