package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Program17 {
    //17. Write a Java program to sort a numeric array and a string array.

    public static void main(String[] args) {


        int[] numArray = {62,8,100,15,34,73,49,62,88,99,55};
        String[] stringArray = {"Harshad", "Rajani", "Suresh", "Magan", "Ramesh"};
        System.out.println("Actual numercial array is " + Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println("Sorted array is " + Arrays.toString(numArray));
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("Actual string array is " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted string array is " + Arrays.toString(stringArray));
    }


}
