import java.util.*;
public class EmployeeSalaryCalculator{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the basic pay : ");
       double basicPay = sc.nextDouble();
       double hra=0.10 * basicPay;
       double ta=0.05 * basicPay;
       double grossSalary = basicPay + hra + ta;
       double professionalTax = 0.02 * grossSalary;
       double netSalary = grossSalary - professionalTax;
       
       System.out.println("Gross salary is : "+grossSalary );
       System.out.println("Professional tax is : "+professionalTax );
       System.out.println("Net salary is : "+netSalary );
     } 
}
