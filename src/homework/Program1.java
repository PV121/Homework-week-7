package homework;

//Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)

import java.util.Scanner;

public class Program1 {
    //main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// scanner code to use console
        System.out.println("Enter an Integer number");//to print statement
        int num = scan.nextInt();

        //if number is divisible by 2 then it's an even number
        //else odd number
        if (num % 2 == 0) {
            System.out.println("Entered number is even");

        } else {
            System.out.println("Entered number is odd");
        }


    }
}