package IteratorPattern;

public class Main {
    public static void main(String[] args) {
        Collection itemcollections = new Collection();
        Iterator iterator = itemcollections.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
