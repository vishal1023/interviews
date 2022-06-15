public class LinkedListNode {
    LinkedListNode next;
    Integer data;

    public LinkedListNode(LinkedListNode next, Integer data) {
        this.next = next;
        this.data = data;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }

    public static LinkedListNode build(LinkedListNode next, Integer data){
        return new LinkedListNode(next, data);
    }
}
