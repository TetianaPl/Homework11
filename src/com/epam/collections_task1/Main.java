package com.epam.collections_task1;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the lower bound of the collection values:");
        int minValue = input.nextInt();
        System.out.println("\nEnter the upper bound of the collection values:");
        int maxValue = input.nextInt();
        System.out.println("\nEnter the quantity of the collection values:");
        int quantity = input.nextInt();

        try {
            ListAndSet someCollection = new ListAndSet(quantity, minValue, maxValue);
            List<Integer> list = someCollection.createList();
            Set<Integer> set = someCollection.createSet();
            System.out.println("\nThe generated list is:\n" + list);
            System.out.println("\nThe generated set is:\n" + set);

        } catch (InvalidInputException err) {
            System.err.println(err.getMessage());
        }
    }
}
