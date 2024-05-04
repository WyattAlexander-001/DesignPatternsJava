package IteratorPattern;

//ListIterator, ArrayIterator, HashMapIterator
public interface Iterator<T> {
    void next();
    T current();
    boolean hasNext();

    //Implemented classes need: implements Iterator<blah>
}
