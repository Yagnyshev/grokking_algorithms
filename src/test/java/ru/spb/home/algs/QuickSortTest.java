package ru.spb.home.algs;

import org.junit.jupiter.api.Test;
import ru.spb.home.algs.QuickSort;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class QuickSortTest {
    @Test
    void quickSort() {
        QuickSort quickSort = new QuickSort();
        List<Integer> result = quickSort.sort(List.of(33, 12, 0, 25, 6));
        assertThat(result).containsExactly(0, 6, 12, 25, 33);
    }
}