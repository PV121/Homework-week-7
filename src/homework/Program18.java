package homework;

public class Program18 {

    // 18. Write a Java program to sum values of an array.

    public static void main(String[] args) {//main method
        int []a={3,5,7,8,9,10};//decaring array
        int sum=0;
        //for loop
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("sum of the array is "+ sum);
    }



}
