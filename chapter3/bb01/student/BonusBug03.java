/* 
This exercise has syntax errors. Debug the errors so that the program displays the product (multiplication) of two integer numbers entered by the user using the keyboard.
*/
import java.util.Scanner;
public class BonusBug03
{
   public static void main(String args[])
	{
    	int num1, num2, result;
    	Scanner keyboard = new Scanner(System.in);
    	System.in.println("Enter an integer value for first number ");
    	num1 = keyboard.nextint();
    	System.out.println("Enter an integer value for second number ");
    	num2 = key.nextInt();
    	result = product(num1,num2); 	System.out.println("The product of " + number1 + " and " + num2 + 	" is : " + result);
	}   
   public static int product(int number1, int number2)
	{
	int productTotal;
	productTotal = num1 * number2;
	return producttotal;
	}
}
