
import java.util.Scanner;
public class ArithmeticProg {    
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        
        // Taking input from the user        
        System.out.print("Enter first number : ");
        System.out.println("                                                  ");
        int num1 = read.nextInt();
        
        
        System.out.print("Enter second number : "); 
        System.out.println("                                                  ");
        int num2 = read.nextInt();
        
        
        // Performing arithmetic operations
        
             
        System.out.println("Sum: " + num1 + " + " + num2 + " = " + (num1+ num2));
        System.out.println("                                                  ");
        System.out.println("Difference: " +  num1 + " - " + num2 + " = " + (num1 - num2)); 
        System.out.println("                                                  ");
        System.out.println("multiplication: " +  num1 + " x " + num2 + " = " +(num1 * num2));
        System.out.println("                                                  ");
        System.out.println("division: " +  num1 + " / " + num2 + " = " +(num1 / num2));   
        System.out.println("                                                  ");
        System.out.println("Remainder: " + num1 + " % " + num2 + " = " + (num1 % num2));
        read.close();
    }
}