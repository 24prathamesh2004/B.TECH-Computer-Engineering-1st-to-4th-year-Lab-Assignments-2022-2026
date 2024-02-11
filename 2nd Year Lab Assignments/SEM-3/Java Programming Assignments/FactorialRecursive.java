/*
PROBLEM STATEMENT :Write a Java recursive method to calculate the factorial of a given positive integer.
 */

public class FactorialRecursive {

  public static int calculateFactorial(int n) {
    if (n == 0) {
      return 1;
    }

    return n * calculateFactorial(n - 1);
  }

  public static void main(String[] args) {
    int number = 7;
    int factorial = calculateFactorial(number);
    System.out.println("Factorial of " + number + " is: " + factorial);
    number = 12;
    factorial = calculateFactorial(number);
    System.out.println("\nFactorial of " + number + " is: " + factorial);
  }
}