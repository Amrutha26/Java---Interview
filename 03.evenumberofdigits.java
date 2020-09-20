package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want me to enter?");
        int num = input.nextInt();

        int[] array = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        for(int i=0; i<array.length; i++) {
            array[i] = input.nextInt();
        }


        System.out.println(findEvenDigitNumbers(array));

    }

  public static int findEvenDigitNumbers(int[] array) {

        int count = 0;
        for(int number: array) {
            if(String.valueOf(number).length() % 2 == 0 ){
                count++;
            }
        }
    return count;
  }

}
