package homework;
//12. Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any character: ");
        char character =scan.next().charAt(0);

        if ((character>='a' && character<='z')||(character>='A' && character<='Z')){
            System.out.println(character+ " is an Alphabet");
        }else if (character>='0' && character<='9'){
            System.out.println(character + " is a Digit");
        }else {
            System.out.println(character + " is a Symbol");
        }

    }
}
