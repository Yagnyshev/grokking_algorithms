package ru.spb.home.algs;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {
    public List<Integer> sort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        } else {
            Integer pivot = list.get(0);
            List<Integer> less = list.stream().skip(1).filter(elem -> elem <= pivot).collect(Collectors.toList());
            List<Integer> greater = list.stream().skip(1).filter(elem -> elem > pivot).collect(Collectors.toList());

            return Stream.of(sort(less), List.of(pivot), sort(greater))
                    .flatMap(Collection::stream)
                    .collect(Collectors.toList());
        }
    }
}
