/*
PROBLEM STATEMENT :Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers), the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).
 */

import java.util.Scanner;
public class Calculate {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int firstInt = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInt = in.nextInt();

        System.out.printf("Sum of two integers: %d\n", firstInt + secondInt);
        System.out.printf("Difference of two integers: %d\n", firstInt - secondInt);
        System.out.printf("Product of two integers: %d\n", firstInt * secondInt);
        System.out.printf("Average of two integers: %f\n", (double) (firstInt + secondInt) / 2);
        System.out.printf("Distance of two integers: %d\n", Math.abs(firstInt - secondInt));
        System.out.printf("Max integer: %d\n", Math.max(firstInt, secondInt));
        System.out.printf("Min integer: %d\n", Math.min(firstInt, secondInt));
    }
}