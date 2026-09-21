class Solution {
    public Node copyRandomList(Node head) {
         if (head == null) {
            return null;
        }
        HashMap<Node, Node> map = new HashMap<>();
        Node current = head;
        while (current != null) {
            Node newNode = new Node(current.val);
            map.put(current, newNode);
            current = current.next;
        }
        current = head;
        while (current != null) {
            Node newNode = map.get(current);
            newNode.next = map.get(current.next);
            newNode.random = map.get(current.random);
            current = current.next;
        }
        return map.get(head);       
    }
}