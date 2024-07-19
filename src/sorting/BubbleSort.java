package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {54, 26, 93, 17, 77, 31, 44, 55, 20};
        bubbleSort(arr, arr.length);
        printArray(arr, arr.length);
        bubbleSortWithRecursion(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int n) {
        int temp;
        boolean swapped;

        for(int i = 0; i < n; i++) {
            swapped = false;
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }
    }

    static void printArray(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSortWithRecursion(int[] arr, int s, int e) {

        if(s == 0){
            return;
        }

        if(e < s) {
            if (arr[e] > arr[e + 1]) {
                int temp = arr[e];
                arr[e] = arr[e + 1];
                arr[e + 1] = temp;
            }

            bubbleSortWithRecursion(arr, s, e + 1);
        } else {
            bubbleSortWithRecursion(arr, s - 1, e);
        }
    }
}
