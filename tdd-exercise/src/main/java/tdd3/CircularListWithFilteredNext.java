package tdd3;

import java.util.Optional;
import java.util.function.Predicate;

import tdd.CircularList;

public interface CircularListWithFilteredNext extends CircularList {

    Optional<Integer> filteredNext(final Predicate<Integer> condition);
}