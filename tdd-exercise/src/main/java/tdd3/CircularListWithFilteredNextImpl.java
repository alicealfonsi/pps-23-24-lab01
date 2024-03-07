package tdd3;

import java.util.Optional;
import java.util.function.Predicate;
import tdd.CircularListImpl;

public class CircularListWithFilteredNextImpl extends CircularListImpl implements CircularListWithFilteredNext {

    @Override
    public Optional<Integer> filteredNext(final Predicate<Integer> condition) {
        for (int i = 0; i < this.size(); i++) {
            int element = this.next().get();
            if (condition.test(element)) {
                return Optional.of(element);
            }
        }
        return Optional.empty();
    }
}