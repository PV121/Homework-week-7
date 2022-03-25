package homework;

//Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)

import java.util.Scanner;

public class Program1 {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Please enter a number : ");
       int number = sc.nextInt();
       // java odd or even
       String oddEven = (number % 2 == 0) ? "even" : "odd";
       System.out.println(number + " is " + oddEven);


    }
}
