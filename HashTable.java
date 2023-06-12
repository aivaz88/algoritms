public class HashTable<K, V> {
    public final Integer FIKS_BASKET_SIZE=16;
    public Basket[] basketArray;

    public HashTable(Integer size) {
        this.basketArray = (Basket[]) new Object[size];
    }

    public HashTable() {
        this.basketArray =(Basket[]) new Object[FIKS_BASKET_SIZE];
    }







}
