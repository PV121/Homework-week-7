package homework;
//11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
//and 5 separately.

public class Program11 {
    public static void main(String[] args) {
        //for loop to number divide by 3.
        System.out.println("These numbers can be divide by 3.");
        for (int i=1; i<=100;i++){
            if (i % 3==0){

                System.out.println(i );
            }

        }
        System.out.println("-------------------------------------------------------------");
        //for loop to number divide by 5.
        System.out.println("These numbers can be divide by 5.");
        for (int i=1; i<=100;i++){
            if (i % 5==0){

                System.out.println(i );
            }
        }
    }
}
