//Write code to remove duplicates from an unsorted linked list

import java.util.HashSet;
import java.util.Set;

class RemoveDuplicates {

    void deleteDups(LinkedListNode n) {
        Set<Integer> set = new HashSet<>();
        LinkedListNode previous = null;
        while (n != null) {
            if (set.contains(n.data)) {
                previous.next = n.next;
            } else {
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedListNode head = LinkedListNode.build(
                LinkedListNode.build(
                        LinkedListNode.build(
                                LinkedListNode.build(
                                        LinkedListNode.build(null, 3), 2
                                ), 2
                        ), 1
                ), 100
        );

        System.out.println("head before removing duplicates = " + head);
        new RemoveDuplicates().deleteDups(head);
        System.out.println("head after removing duplicates = " + head);
    }
}


















