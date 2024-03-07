package tdd2;

import java.util.Iterator;

import tdd.CircularListImpl;

public class CircularListWithIteratorImpl implements CircularListWithIterator {

    private CircularListImpl circularList = new CircularListImpl();

    @Override
    public void add(final int element) {
        this.circularList.add(element);
    }

    @Override
    public int size() {
        return this.circularList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.circularList.isEmpty();
    }

    @Override
    public Iterator<Integer> forwardIterator() {
        return new Iterator<Integer>() {

            public boolean hasNext() {
                return !isEmpty();
            }

            public Integer next() {
                return circularList.next().get();
            }
        };
    }

    @Override
    public Iterator<Integer> backwardIterator() {
        return new Iterator<Integer>() {

            public boolean hasNext() {
                return !isEmpty();
            }

            public Integer next() {
                return circularList.previous().get();
            }
        };
    }

    @Override
    public void reset() {
        this.circularList = new CircularListImpl();
    }
}
