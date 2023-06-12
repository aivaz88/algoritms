public class HashTable<K, V> {
    private static final Integer FIKS_BASKET_SIZE=16;
    private Basket[] basketArray;

    public HashTable(Integer size) {
        this.basketArray = (Basket[]) new Object[size];
    }
    public HashTable() {
        this.basketArray =(Basket[]) new Object[FIKS_BASKET_SIZE];
    }
    private class Entity {
        private K key;
        private V value;

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
    private class Basket {
        private Node head;

        public Node getHead() {
            return head;
        }

        public void setHead(Node head) {
            this.head = head;
        }

        private static class Node {
            private Entity value;
            private Node next;
        }
    }

    private Integer calculateIndex(K key) {
        return key.hashCode()% basketArray.length;
    }

    private V get(K key) {
        if (basketArray[calculateIndex(key)] != null){
            return (V) basketArray[calculateIndex(key)];
        }
        return null;
    }

    private Boolean add(Entity entity){
        if (basketArray[calculateIndex(entity.getKey())] != null){
            return false;
        }
        Basket.Node node = new Basket.Node();
        node.value=entity;
        Basket basket = new Basket();
        Basket.Node head=basket.getHead();
        Basket.Node current = node;
        while (current.next!=null){
            current = current.next;
        }
        current.next = node;
        return true;
    }


}
