package homework;
//Number of Days In Month
//Write a method isLeapYear with a parameter of type int named year.
//The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//If the parameter is not in that range return false.
//Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
//otherwise return false.
//A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
//Example of input/Output:
//● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
//● isLeapYear(1600); should return true since 1600 is a leap year
//● isLeapYear(2017); should return false since 2017 is not a leap year
//● isLeapYear(2000);should return true because 2000 is a leap year
//Write another method getDaysInMonth with two parameter month and year. Both of type
//int.
//If parameter month is < 1 or >12 return -1.
//If parameter year is <1 or >9999 than return -1.
//This method needs to return the number of days in the month. Be careful about leap years
//they have 29 days in month 2 (February).
//You should check if the year is a leap year using the method isLeapYear describe above.
//
//Example of input/Output:
//● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
//● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
//year.
//● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
//2018 is not a leap year.
//● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
//● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
//9999
//HINT: Use the switch statement.
//NOTE: Methods isLeapYear and getDaysInMonth need to be public static

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        isLeapyr(year);
        System.out.println("Enter the month");
        int month = sc.nextInt();
        getDaysInMonth(year, month);

    }


    public static boolean isLeapyr(int year) {

        boolean a;

        if (year <= 1 || year >= 9999) {
            System.out.println("Since the parameter is not in the range(1-9999)");
            a = false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is leap year");
            a = true;
        } else {
            System.out.println(year + " is Not a leap year");
            a = false;

        }
        return a;   }

    public static int getDaysInMonth(int year,int month){
        switch (month){
            case 1:
                if(year < 1 || year > 9999){
                    System.out.println("Invalid year");
                }else {
                    System.out.println("31 days in January month");
                }
                break;
            case 2:
                if (month == 2 && year%4==0 && year % 100 != 0){
                    System.out.println("29 days in february month of leap year");
                }else {
                    System.out.println("28 days in february month of non leap year");
                }
                break;
            case 3:
                if (year < 1 || year > 9999){
                    System.out.println("Invalid year");
                }else{
                    System.out.println("31 days in March month");
                }
                break;
            case 4:
                if (year < 1 || year > 9999){
                    System.out.println("Invalid year");
                }else{
                    System.out.println("30 days in April month");
                }
                break;
            case 5:
                if (year < 1 || year > 9999){
                    System.out.println("Invalid year");
                }else{
                    System.out.println("31 days in May month");
                }
                break;
            case 6:
                if (year < 1 || year > 9999){
                    System.out.println("Invalid year");
                }else{
                    System.out.println("30 days in June month");
                }
                break;
            case 7:
                if (year < 1 || year > 9999){
                    System.out.println("Invalid year");
                }else{
                    System.out.println("31 days in July month");
                }
                break;
            case 8:
                if (year < 1 || year > 9999){
                    System.out.println("Invalid year");
                }else{
                    System.out.println("31 days in august month");
                }
                break;
            case 9:
                if (year < 1 || year > 9999){
                    System.out.println("Invalid year");
                }else{
                    System.out.println("30 days in September month");
                }
                break;
            case 10:
                if (year < 1 || year > 9999){
                    System.out.println("Invalid year");
                }else{
                    System.out.println("31 days in October month");
                }
                break;
            case 11:
                if (year < 1 || year > 9999){
                    System.out.println("Invalid year");
                }else{
                    System.out.println("30 days in November month");
                }
                break;
            case 12:
                if (year < 1 || year > 9999){
                    System.out.println("Invalid year");
                }else{
                    System.out.println("31 days in December month");
                }
                break;
            default:
                System.out.println("Invalid Month");
                System.out.println("Invalid year");
        }
        return 0;
    }}





