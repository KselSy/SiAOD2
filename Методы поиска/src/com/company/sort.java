package com.company;

import java.util.ArrayList;

public class sort {
    public static void QuickSort(ArrayList<Integer> array, int low, int high){
        if( low >= high )return;
        int pivot = array.get(high);
        int index = low;
        for(int i = low ; i <high; i++){
            if(array.get(i) < pivot){
                int temp = array.get(i);
                array.set(i, array.get(index));
                array.set(index, temp);
                index++;
            }
        }
        int temp = array.get(high);
        array.set(high, array.get(index));
        array.set(index, temp);

        QuickSort(array,low,index - 1);
        QuickSort(array,index + 1, high);
    }
}
