class Solution {
    public Node flatten(Node head) {
         Node current = head;
        while (current != null) {
            if (current.child == null) {
                current = current.next;
                continue;
            }
            Node next = current.next;
            Node child = flatten(current.child);
            current.next = child;
            child.prev = current;
            Node last = child;
            while (last.next != null) {
                last = last.next;
            }
            if (next != null) {
                last.next = next;
                next.prev = last;
            }
            current.child = null;
            current = current.next;
        }
       return head;       
    }
}