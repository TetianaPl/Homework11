package com.epam.collections_task1;

import java.util.*;

public class ListAndSet {
    private Collection<Integer> randomCollection;
    private int quantity;
    private int minValue;
    private int maxValue;

    public ListAndSet(int quantity, int minValue, int maxValue) throws InvalidInputException {
        if (maxValue - minValue + 1 >= quantity) {
            this.quantity = quantity;
            this.minValue = minValue;
            this.maxValue = maxValue;
            Collection<Integer> randomCollection = new ArrayList<>();
            for (int i = 1; i <= quantity; i++) {
                randomCollection.add((int) (Math.random() * (maxValue - minValue) + minValue));
            }
            this.randomCollection = randomCollection;

        } else {
            throw new InvalidInputException();
        }
    }

    public List<Integer> createList() {
        List<Integer> list = new ArrayList<>(randomCollection);
        return list;
    }

    public Set<Integer> createSet() {
        Set<Integer> tree = new TreeSet<Integer>(randomCollection);
        for (int i = minValue; i <= maxValue && tree.size() < quantity; i++) {
            tree.add(i);
        }
        return tree;
    }
}
