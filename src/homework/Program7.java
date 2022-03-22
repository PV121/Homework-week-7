package homework;
//Write a java program input sales id, seller's name, sales amount, and salary basic and
//then fined this sales
//Commission
//Sales amount >= 50,000 35%
//Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%

import java.util.Scanner;

public class Program7 {
    //main method
    public static void main(String[] args) {
        //scanner code
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter sales ID number: ");
        int salesId = input.nextInt();

        System.out.println("Please enter seller's name: ");
        String sellername = input.next();

        System.out.println("Please enter sales amount ");
        System.out.print("$ ");
        float salesAmount = input.nextFloat();

        System.out.println("Please enter basic salary: ");
        System.out.print("$ ");
        float basicsalary = input.nextFloat();

        //conditional statements to find out the commission value based on salary
        float commission;// declaring float variable
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales commission is $ " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales commission is $ " + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales commission is $ " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales commission is $ " + commission);
        } else if (salesAmount < 10000) {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales commission is $ " + commission);
        }

    }
}
