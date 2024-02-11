/*
PROBLEM STATEMENT :Write a Java program to display Pascal's triangle.

Test Data
Input number of rows: 5
Expected Output :

Input number of rows: 5                                                          
      1                                                                          
     1 1                                                                         
    1 2 1                                                                        
   1 3 3 1                                                                       
  1 4 6 4 1
 */

import java.util.Scanner;
public class Pattern {

  public static void main(String[] args){
    int n;
    System.out.print("Input number of rows: ");
    Scanner in = new Scanner(System.in);
		    n = in.nextInt();
    for (int line = 1; line <= n; line++) {
        for (int j = 0; j <= n - line; j++) {
            System.out.print(" ");
        }

        int k = 1;
        for (int i = 1; i <= line; i++) {
            System.out.print(k + " ");
            k = k * (line - i) / i;
        }

        System.out.println();
    }
}
}