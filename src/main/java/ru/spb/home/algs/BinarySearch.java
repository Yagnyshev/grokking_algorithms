package ru.spb.home.algs;

public class BinarySearch {
    public Integer search(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return null;
    }
}
