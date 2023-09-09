package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7,8,9,2,5,11,34,78,54,3,9,55,23,76};

        ArrayList<Integer> b = new ArrayList<>();

        for (int item : a){
            if (!b.contains(item)){
                b.add(item);

            }
        }
        System.out.println("New list: " + b);
    }
}