// Write a Java method to compute the average of three numbers

import java.util.*;
public class Q1 {

    public static double average(double a, double b, double c){
        return (a+b+c)/3;
    }
    public static void main (String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter the third number: ");
        double c = sc.nextDouble();

        double result = average(a, b, c);
        System.out.println(result);
    }
}