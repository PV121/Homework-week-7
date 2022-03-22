package homework;

import javax.crypto.spec.PSource;
import java.util.Locale;
import java.util.Scanner;

//Same as above program-8 using switch statement.
public class Program9 {
    public static void main(String[] args) {
        String a[]={"Ahemdabad","Bombay","Chandigarh","Dakor","Elora","Fatehgarh"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first letter of city between \"A\" to \"F\" : ");
        String letter= scan.next();

        switch (letter.toLowerCase()){
            case "a":
                System.out.println(a[0]);
                break;
            case "b":
                System.out.println(a[1]);
                break;
            case "c":
                System.out.println(a[2]);
                break;
            case "d":
                System.out.println(a[3]);
                break;
            case "e":
                System.out.println(a[4]);
                break;
            case "f":
                System.out.println(a[5]);
                break;
            default:
                System.out.println("Invalid Entry");
        }



    }



}
