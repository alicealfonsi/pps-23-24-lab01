import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tdd3.CircularListWithFilteredNext;
import tdd3.CircularListWithFilteredNextImpl;
import java.util.Optional;

public class CircularListWithFilteredNextTest {

    private CircularListWithFilteredNext list = new CircularListWithFilteredNextImpl();

    @Test
    void testFilteredNextElement() {
        this.list.add(1);
        this.list.add(2);
        this.list.add(3);
        assertEquals(Optional.of(2), this.list.filteredNext(element -> element.equals(2)));
    }

    @Test
    void testFilteredNextWithWrongCondition() {
        this.list.add(1);
        assertEquals(Optional.empty(), this.list.filteredNext(element -> false));
    }

    @Test
    void testFilteredNextWithEmptyList() {
        this.list = new CircularListWithFilteredNextImpl();
        assertEquals(Optional.empty(), this.list.filteredNext(element -> element==1));
    }
}