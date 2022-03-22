package homework;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//        any other alphabet should be invalid entry

import java.util.Locale;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        String a[]={"Ahemdabad","Bombay","Chandigarh","Dakor","Elora","Fatehgarh"};
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter \"A\" to \"F\" alphabat: ");
        String city= scan.next();
        String city1= city.toLowerCase();//convert uppercase to lowercase


        if (city1.startsWith("a")){
            System.out.println(a[0]);
        }else if (city1.startsWith("b")) {
            System.out.println(a[1]);
        } else if (city1.startsWith("c")){
                System.out.println(a[2]);
        }else if (city1.startsWith("d")) {
            System.out.println(a[3]);
        }else if (city1.startsWith("e")) {
            System.out.println(a[4]);
        }else if (city1.startsWith("f")) {
            System.out.println(a[5]);
        }else {
            System.out.println("Invalid Entry");
        }

    }

}
