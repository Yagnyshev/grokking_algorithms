package ru.spb.home.algs;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    private int findSmallest(List<Integer> list) {
        int smallest = list.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public List<Integer> sort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>();
        while (list.size() > 0) {
            int smallest = findSmallest(list);
            sortedList.add(list.remove(smallest));
        }
        return sortedList;
    }
}
