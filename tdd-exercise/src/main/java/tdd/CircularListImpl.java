package tdd;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class CircularListImpl implements CircularList {

    private List<Integer> circularList;
    private int currentIndex = 0;

    public CircularListImpl() {
        this.circularList = new ArrayList<Integer>();
    }

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
    public Optional<Integer> next() {
        if (this.circularList.isEmpty()) {
            return Optional.empty();
        }
        this.currentIndex = (this.currentIndex + 1) % this.circularList.size();
        Integer element = this.circularList.get(this.currentIndex);
        return Optional.of(element);
    }

    @Override
    public Optional<Integer> previous() {
        if (this.circularList.isEmpty()) {
            return Optional.empty();
        }
        this.currentIndex = (this.currentIndex - 1 + this.circularList.size()) % this.circularList.size();
        Integer element = this.circularList.get(this.currentIndex);
        return Optional.of(element);
    }

    @Override
    public void reset() {
        this.circularList = new ArrayList<Integer>();
    }
}