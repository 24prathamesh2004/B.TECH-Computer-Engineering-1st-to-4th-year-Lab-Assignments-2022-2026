import java.util.*;
public class Armstrong{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       int number, originalNo, remainder, result=0;
        number=sc.nextInt();
       originalNo = number;
       
       while(originalNo != 0){
            remainder = originalNo % 10;
            result += Math.pow(remainder,3);
            originalNo /= 10;
       }
       if(result == number){
          System.out.println(number +" is an armstrong number.");
       }
       else{
          System.out.println(number +" is not an armstrong number.");
       }
    }

}


