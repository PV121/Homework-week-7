package homework;
//16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//        “ZERO”

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= input.nextInt();

        if (num >0){
            System.out.println(num+ " is a positive number.");
        }else if (num <0){
            System.out.println(num+ " is a negative number.");

        }else {
            System.out.println(num+ " is zero.");
        }
    }

}
