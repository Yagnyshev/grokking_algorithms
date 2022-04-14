package ru.spb.home.algs;

import org.junit.jupiter.api.Test;
import ru.spb.home.algs.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SelectionSortTest {
    @Test
    public void test() {
        SelectionSort selectionSort = new SelectionSort();
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 7, 9, 1, 2, 0, -1));
        List<Integer> result = selectionSort.sort(list);
        assertThat(result).containsExactly(-1, 0, 1, 2, 5, 7, 9);
    }
}