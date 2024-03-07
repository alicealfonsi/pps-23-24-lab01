import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.CircularListImpl;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    private CircularListImpl circularList;

    @BeforeEach
    void beforeEach() {
        this.circularList = new CircularListImpl();
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
    void testSize() {
        this.circularList.add(1);
        this.circularList.add(2);
        assertEquals(2, this.circularList.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(circularList.isEmpty());
    }

    @Test
    void testNextWithEmptyList() {
        assertEquals(Optional.empty(), this.circularList.next());
    }

    @Test
    void testNext() {
        this.circularList.add(1);
        this.circularList.add(2);
        assertEquals(Optional.of(2), this.circularList.next());
    }

    @Test
    void testPreviousWithEmptyList() {
        assertEquals(Optional.empty(), this.circularList.previous());
    }

    @Test
    void testPrevious() {
        this.circularList.add(1);
        this.circularList.add(2);
        this.circularList.add(3);

        this.circularList.previous();
        this.circularList.previous();
        assertEquals(Optional.of(1), this.circularList.previous());
    }
    
    @Test
    void testReset() {
        this.circularList.add(1);
        this.circularList.add(2);
        this.circularList.reset();
        assertEquals(0, this.circularList.size());
    }
}