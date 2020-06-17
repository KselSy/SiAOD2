package com.company;

import java.util.ArrayList;

public class find {
    public static int binarySearch(ArrayList<Integer> array, int key, int low, int high) throws Exception {
        int index = -1;

        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (array.get(mid) < key) {
                low = mid + 1;
            } else if (array.get(mid) > key) {
                high = mid - 1;
            } else if (array.get(mid) == key) {
                index = mid;
                return index;
            }
        }
        throw new Exception("The number couldn't be found within [a;b]!");
    }

}
