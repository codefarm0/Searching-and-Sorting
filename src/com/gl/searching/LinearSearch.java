package com.gl.searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in data set");
        int num = sc.nextInt();
        System.out.println("Enter " + num + " elements ");
        int dataSet[] = new int[num];
        for(int i=0; i<num;i++){
            dataSet[i] = sc.nextInt();
        }
        System.out.println("Enter target element - ");
        int target = sc.nextInt();
        long start = System.nanoTime();

        boolean found = false;
        int index;
        for(index =0; index< dataSet.length; index++){

            if(target == dataSet[index]){
                found = true;
                break;
            }
        }
        System.out.println("total time to process the data set - "+ (System.nanoTime() - start) + "nanosecond");
        if(found){
            System.out.println("**** target element found in data set at index - " + index);
        }else{
            System.out.println("**** target element is not in data set");
        }
    }
}
