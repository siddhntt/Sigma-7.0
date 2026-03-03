// Write a Java method to compute the sum of the digits in an integer.
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num!=0){
            int digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        System.out.println("The sum of digits is "+ sum);
    }
}
