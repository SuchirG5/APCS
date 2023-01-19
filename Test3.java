//program to average 3 numbers
import java.util.Scanner;

public class Test3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        double average;
        System.out.print("Enter first integer: ");
        num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        num2 = input.nextInt();
        System.out.print("Enter third integer: ");
        num3 = input.nextInt();
        average = (num1 + num2 + num3) / 3;
        System.out.printf("Average is %f", average);
    }
}