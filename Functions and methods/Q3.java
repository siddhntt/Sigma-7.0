// Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not)

import java.util.*;
public class Q3 {
    public static boolean palindrome(int palindrome){
        int a = palindrome;
        int r = 0;
        while(a!=0){
            int last_digit = a%10;
            r = r * 10+ last_digit;
            a = a /10;
        }
        if(r==palindrome){
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        boolean result = palindrome(a);
        if(result){
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
