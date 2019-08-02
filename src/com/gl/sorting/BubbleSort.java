package com.gl.sorting;

import java.util.Scanner;

/**
 * @author - Green Learner
 * @contact - https://facebook.com/greenlearner
 */
public class BubbleSort {
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

        bubbleSort(dataSet);
    }

    private static void displayElements(int[] dataSet) {

        for(int i : dataSet){
            System.out.print(i + ", ");
        }
    }

    private static void bubbleSort(int[] dataSet) {
        int length = dataSet.length;

        boolean isSwapHappened = false;
        int counter = 0;
        for(int i = 0; i<  length-1; i++){
            for(int j=0; j<length-i-1; j++){
                if(dataSet[j] > dataSet[j+1]){
                    int temp = dataSet[j];
                    dataSet[j] = dataSet[j+1];
                    dataSet[j+1] = temp;
                    isSwapHappened = true;

                }
                counter++;
            }
            if(!isSwapHappened){
                break;
            }

        }

        System.out.print("After sorting - \n[");
        displayElements(dataSet);
        System.out.println("]");

        System.out.println("Total iterations to perform sorting- " + counter);
    }
}
