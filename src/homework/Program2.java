package homework;

//Write a java program to input any year like (ex.2007) and find out if it is leap year or
//not?

import java.util.Scanner;

public class Program2 {
    // main method
    public static void main(String[] args) {
        //scanner code
        Scanner leap= new Scanner(System.in);
        System.out.println("Enter year =");
        int year= leap.nextInt();


        //if condition for leap year
        if (((year % 4 == 0 ) && (year % 100 != 0)|| (year % 400 == 0)))  {
            System.out.println(year + " is a leap year.");
        }

        else {
            System.out.println(year + " is not a leap year.");
        }

    }



}
