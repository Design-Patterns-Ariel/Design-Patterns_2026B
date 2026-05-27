package Week04.Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Collection ll = new LinkedList();
        LinkedList ll1 = new LinkedList();

        boolean bool = containsNum(ll,1);
        Store store = new Store();
        bool = containsNum(store,2);
        
    }

    private static boolean containsNum(Collection ll, int i) {
        return ll.contains(i);
    }


}

class Store<E> implements Collection<E>{


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}