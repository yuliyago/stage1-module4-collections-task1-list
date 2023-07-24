package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int[] array = new int[2];
        array[0] = Integer.parseInt(a);
        array[1] = Integer.parseInt(b);
        for (int i = 0; i < 2; i++) {
            array[i] = array[i] * array[i] * 5 + 3;
        }
        if (array[0] > array[1]) return 1;
        else if (array[0] == array[1]) {
            return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
        } else return -1;
    }
}
