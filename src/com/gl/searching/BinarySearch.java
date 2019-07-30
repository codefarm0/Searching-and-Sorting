package com.gl.searching;

import java.util.Scanner;

/**
 * @author - Green Learner
 * @contact - https://fb.me/greenlearner
 */
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in data set");
        int num = sc.nextInt();
        System.out.println("Enter " + num + " elements ");
        int dataSet[] = new int[num];
        for (int i = 0; i < num; i++) {
            dataSet[i] = sc.nextInt();
        }
        System.out.println("Enter target element - ");
        int target = sc.nextInt();
        long start = System.nanoTime();

        int index = doBinarySearch(dataSet, target);

        System.out.println("**** total time to process the data set - " + (System.nanoTime() - start) + " nanosecond");
        if (index != Integer.MIN_VALUE) {
            System.out.println("**** target element found in data set at index - " + index);
        } else {
            System.out.println("**** target element is not in data set");
        }
    }

    private static int doBinarySearch(int[] dataSet, int target) {
        int start = 0;
        int end = dataSet.length - 1;

        int totalIterations = 0;
        int index = Integer.MIN_VALUE;
        while (start <= end) {
            totalIterations++;
            int mid = (end + start) / 2;
            if (target == dataSet[mid]) {
                index = mid;
                break;
            } else if (target < dataSet[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("**** Total iterations performed - " + totalIterations);
        return index;
    }
}

