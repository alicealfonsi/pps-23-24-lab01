import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd2.CircularListWithIteratorImpl;

public class CircularListWithIteratorTest {
    
    private CircularListWithIteratorImpl circularList;

    @BeforeEach
    void beforeEach() {
        this.circularList = new CircularListWithIteratorImpl();
    }

    @Test
    void testAdd() {
        this.circularList.add(1);
        assertEquals(1, this.circularList.size());
    }

    @Test
    void testSizeIsInitiallyZero() {
        assertEquals(0, this.circularList.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(this.circularList.isEmpty());
    }

    @Test
    void testForwardIteratorWithEmptyList() {
        assertFalse(this.circularList.forwardIterator().hasNext());
    }

    @Test
    void testForwardIterator() {
        this.circularList.add(1);
        this.circularList.add(2);
        assertEquals(2, this.circularList.forwardIterator().next());
    }

    @Test
    void testBackwardIteratorWithEmptyList() {
        assertFalse(this.circularList.backwardIterator().hasNext());
    }

    @Test
    void testBackwardIterator() {
        this.circularList.add(1);
        this.circularList.add(2);
        assertEquals(2, this.circularList.backwardIterator().next());
    }
    
    @Test
    void testReset() {
        this.circularList.add(1);
        this.circularList.add(2);
        this.circularList.reset();
        assertEquals(0, this.circularList.size());
    }
}
