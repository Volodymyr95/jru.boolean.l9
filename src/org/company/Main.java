package org.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        int[] arr = new int[10];

        fillArrayOfRandomNumber(arr);
        printArray(arr);
//        replaceNotEvenElementsOnNegative(arr, -1);
//        printArray(arr);

        int arraySumm = getArraySumm(arr);
        System.out.println("Sum : " + arraySumm);

    }

    public static int getArraySumm(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        return summ;
    }

    public static int[] getFilledArray() {
        return getFilledArray(10);
    }

    public static int[] getFilledArray(int size) {
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void fillArrayOfRandomNumber(int[] arr) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void replaceNotEvenElementsOnNegative(int[] arr) {
        arr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = -1;
            }
        }
    }

    public static void replaceNotEvenElementsOnNegative(int[] arr, int negativeValue) {

        if (negativeValue > 0) {
            negativeValue = -negativeValue;
        } else if (negativeValue == 0) {
            negativeValue = -1;
        }
        arr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = negativeValue;
            }
        }
    }
}
