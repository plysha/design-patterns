package org.patterns.behavioral.iterator.iterators;

public interface Iterator<T> {
    boolean hasNext();

    T getNext();

    void reset();
}
