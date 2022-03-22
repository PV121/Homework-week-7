package homework;
//10.Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else)

import java.util.Scanner;

public class Program10 {
    //main method
    public static void main(String[] args) {
        //scanner code
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number a : ");
        double a = scan.nextDouble();

        System.out.println("Enter second number b : ");
        double b = scan.nextDouble();

        System.out.println("Input symbol (+,-,*,/) to calculate to numbers: ");
        char operator = scan.next().charAt(0);
        //calculation stored in variables
        double sum1 = a + b;//additiom
        double sum2 = a - b;//subtraction
        double sum3 = a * b;//multiplication
        double sum4 = a / b;//division

        //neasted if else statement
        if (operator=='+') {
            System.out.println(a + " + " + b + " = " + sum1);
        }else if (operator=='-') {
            System.out.println(a + " - " + b + " = " + sum2);
        }else if (operator=='*') {
            System.out.println(a + " * " + b + " = " + sum3);
        }else {
            System.out.println(a + " / " + b + " = " + sum4);
        }


    }

    }

