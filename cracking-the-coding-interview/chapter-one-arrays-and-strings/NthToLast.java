//Implement an algorithm to find the kth to last element of a single linked list

public class NthToLast {
    LinkedListNode nthToLast(LinkedListNode head, int k) {
        if (k <= 0) return null;

        LinkedListNode p1 = head;
        LinkedListNode p2 = head;

        //move p2 forward k nodes into the list
        for (int i = 0; i < k - 1; i++) {
            if (p2 == null) return null; //error check
            p2 = p2.next;
        }

        if (p2 == null) return null;

        /* now, move p1 and p2 at the same speed. When p2 hits the end,
         * p1 will be at the right element */
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }


    public static void main(String[] args) {
        LinkedListNode head = LinkedListNode.build(
                LinkedListNode.build(
                        LinkedListNode.build(
                                LinkedListNode.build(
                                        LinkedListNode.build(
                                                LinkedListNode.build(
                                                        LinkedListNode.build(LinkedListNode.build(null, 343),
                                                                83),
                                                        18),
                                                3),
                                        2),
                                2),
                        1),
                100);

        int k = 1;
        System.out.println(k + "th Node from end is : - " + new NthToLast().nthToLast(head, k).data);
    }
}