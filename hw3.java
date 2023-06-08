public class hw3 {
    private Node head;
    private Node tail;

    private class Node {
        public Node nextNode;
        private Node previousNode;
        private int value;
    }

    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.nextNode = head;
        } else {
            tail=node;
        }
        node.previousNode = null;
        head=node;
    }

    public void dellFirst(int value) {
        if (head != null) {
            head = head.nextNode;
        }
        head.previousNode = null;
    }

    public Boolean findNodeBol(int value) {
        Node node = head;
        while (node.nextNode != null) {
            node = node.nextNode;
            if (node.value == value) {
                return true;
            }
            node = node.nextNode;
        }
        return false;
    }

    public Boolean findNode(int value) {
        Node node = head;
        while (node.nextNode != null) {
            if (node.value == value) {
                return node;
            }
            node = node.nextNode;
        }
        return null;
    }

    public void addLast(int value) {
        Node temp = head;
        while (temp.nextNode != null) {
            temp=temp.nextNode;
        }
        Node node = new Node();
        node.value = value;
        node.nextNode=null;
        node.previousNode=tail;
        node.previousNode.nextNode=node;
    }

    public void dellLast() {
        Node temp = head;
        while (temp.nextNode != null) {
            temp=temp.nextNode;
        }
        temp.previousNode.nextNode=null;
    }
}
