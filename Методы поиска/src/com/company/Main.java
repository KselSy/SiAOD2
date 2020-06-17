package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Input list size");
        n = in.nextInt();
        ArrayList<Integer> spisok = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < n; i++){
            spisok.add(random.nextInt(n));
        }
        long start, end;

        sort.QuickSort(spisok,0,n-1);
        int a;
        int b = -1;
        int index;
        do {
            in = new Scanner(System.in);
            System.out.println("Input the element you are looking for (-1 for exit): ");
            a = in.nextInt();
            if(a !=(b)){
                start=System.currentTimeMillis();
                index = find.binarySearch(spisok,a,0,spisok.size()-1);
                end=System.currentTimeMillis();
                System.out.println("BinarySearch: index: " + index + " time: " + (end-start));
                start=System.currentTimeMillis();
                index = spisok.indexOf(a);
                end=System.currentTimeMillis();
                System.out.println("Default search: index: " + index + " time: " + (end-start));
            }
        }
        while (a != b);

    }
}
