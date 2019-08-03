package com.gl.sorting;

import java.util.Scanner;

/**
 * Project - Searching and Sorting <br>
 * Facebook page - https://facebook.com/greenlearner <br>
 * Official youtube channel - https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA <br>
 * Date - 03-08-2019
 *
 */
public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in data set");
        int num = sc.nextInt();
        System.out.println("Enter " + num + " elements ");
        int dataSet[] = new int[num];
        for (int i = 0; i < num; i++) {
            dataSet[i] = sc.nextInt();
        }
        System.out.print("Before sorting - \n[");
        displayElements(dataSet);
        System.out.println("]");

        sortElementsInSelectionSortWay(dataSet);
    }

    private static void displayElements(int[] dataSet) {

        for(int i : dataSet){
            System.out.print(i + ", ");
        }
    }

    private static void sortElementsInSelectionSortWay(int[] dataSet) {
        int length = dataSet.length;

        int counter = 0;
        for(int i = 0; i<  length-1; i++){
            int key = dataSet[i];
            int min = i;
            for(int j=i+1; j< length; j++){
                if(dataSet[j] < dataSet[min]){
                    key = j; // found new min
                }
                counter++;
            }
            if(min !=i){// if true then there is new min element
                int temp = dataSet[min];
                dataSet[min] = dataSet[i];
                dataSet[i] = dataSet[temp];
            }

        }

        System.out.print("After sorting - \n[");
        displayElements(dataSet);
        System.out.println("]");

        System.out.println("Total iterations to perform sorting- " + counter);
    }
}
