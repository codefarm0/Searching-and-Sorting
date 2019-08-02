package com.gl.sorting;

import java.util.Scanner;

/**
 * Project - Searching and Sorting<br>
 * Author - Green Learner <br>
 * Contact - facebook - https://facebook.com/greenlearner <br>
 * Date - 02-08-2019
 */
public class InsertionSort {
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

        sortElementsInInsertionSortWay(dataSet);
    }

    private static void displayElements(int[] dataSet) {

        for(int i : dataSet){
            System.out.print(i + ", ");
        }
    }

    private static void sortElementsInInsertionSortWay(int[] dataSet) {
        int length = dataSet.length;

        int counter = 0;
        for(int i = 0; i<  length; i++){
            int key = dataSet[i];
            int j = i-1;
           while(j>=0 && dataSet[j] > key){
               dataSet[j+1] = dataSet[j];
               j--;

               counter++;//counts the total iterations(not part of the algo)
           }
           dataSet[j+1] = key;

            counter++;//counts the total iterations(not part of the algo)

        }

        System.out.print("After sorting - \n[");
        displayElements(dataSet);
        System.out.println("]");

        System.out.println("Total iterations to perform sorting- " + counter);
    }
}
