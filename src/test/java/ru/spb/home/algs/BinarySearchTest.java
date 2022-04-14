package ru.spb.home.algs;

import org.junit.jupiter.api.Test;
import ru.spb.home.algs.BinarySearch;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {
    @Test
    void search() {
        int[] arr = new int[]{1, 3, 5, 7, 9};
        int item = 7;
        BinarySearch binarySearch = new BinarySearch();
        Integer result = binarySearch.search(arr, item);
        assertThat(result).isEqualTo(3);
    }
}