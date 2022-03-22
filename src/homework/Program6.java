package homework;

import java.util.Scanner;

//Write a java program to input any number and find out if it’s odd or even.
public class Program6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int scan = input.nextInt();

        //if number is divisible by 2 then it's an even number
        //else odd number
        if (scan % 2 == 0) {
            System.out.println(+scan+" is even number");

        } else {
            System.out.println(+scan+" is odd number");

        }

    }
}
