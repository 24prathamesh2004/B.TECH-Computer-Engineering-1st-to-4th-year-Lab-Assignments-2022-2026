/*
PROBLEM STATEMENT :Write a Java recursive method to calculate the nth Fibonacci number.
 */

public class FibonacciRecursive {

  public static int calculateFibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }

    return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
  }

  public static void main(String[] args) {
    int position = 0;
    int fibonacciNumber = calculateFibonacci(position);
    System.out.println("The Fibonacci number at position " + position + " is: " + fibonacciNumber);
    position = 3;
    fibonacciNumber = calculateFibonacci(position);
    System.out.println("\nThe Fibonacci number at position " + position + " is: " + fibonacciNumber);
    position = 9;
    fibonacciNumber = calculateFibonacci(position);
    System.out.println("\nThe Fibonacci number at position " + position + " is: " + fibonacciNumber);
  }
}