package homework;
//19. Write a Java program to calculate the average value of array elements.

public class Program19 {
    public static void main(String[] args) {//main method
        //variables
        int a[]={5,25,38,56,99,45,78};
        int sum=0;
        double average=0;

        //for loop
        for (int i=0; i<a.length; i++){
            sum= sum + a[i];
            average = sum / a.length;

        }
        System.out.println(" Average of the array is " + average);
    }
}
