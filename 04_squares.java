//WORST CASE:

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int arr[] = {-6, -3, -1, 2, 4, 5};
        int n = arr.length;

        System.out.print("Before sort ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sortSquares(arr);
        System.out.print("After sort ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void sortSquares(int arr[]) {

        int n = arr.length;

//        Conversion of array elements to its square
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

//        Sorting arrays using inbuilt sort function
        Arrays.sort(arr);
    }

}
