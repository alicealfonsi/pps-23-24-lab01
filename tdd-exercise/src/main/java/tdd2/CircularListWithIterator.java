package tdd2;

import java.util.Iterator;

/**
 * A new version of CircularList
 */
public interface CircularListWithIterator {

    /**
     * Adds an element to the list, namely, after the last inserted one.
     * @param element the element to be added to the list
     */
    void add(final int element);

    /**
     * Provides the current size of the list.
     * @return the size of the list
     */
    int size();

    /**
     * Checks if the list is empty.
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Provides the next element of the list.
     * @return the next element of the list, or an empty optional if the list is empty
     */
    Iterator<Integer> forwardIterator();

    /**
     * Provides the previous element of the list.
     * @return the previous element into the list, or an empty optional if the list is empty
     */
    Iterator<Integer> backwardIterator();

    /**
     * Reset the position of current element back to the first one of the list.
     * Note the first one is the first added to the list.
     */
    void reset();
}