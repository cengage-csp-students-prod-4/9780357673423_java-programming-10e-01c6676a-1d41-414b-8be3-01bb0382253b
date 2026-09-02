/* Enter a number from 1 to 100 using your keyboard
Any values not in range – will display an error message.
Please correct the logic and syntax errors to display the correct value.  Try entering 100, 0 -10, etc.. to make sure the logic is correct and appropriate message is displayed. */

import java.util.Scanner;
public class BonusBug05
{
   public static void main(String args[])
   {
    int guess_number;
    Scanner keyboard = new Scanner (System.in);
    System.out.print(Please enter your guessed number from 1 - 100: ");
    guess_number = keyboard.nextint();
    if (guess_number > 0 || guess_number < 100)
        {
        System.out.println("Your guessed number is: " + guess_number);
        System.out.println("This number is valid and within the specified range (1-100).");
        }
    Else
        {   System.out.println("You entered  " + guess_number + ". This number is invalid as it is not within the specified range (1-100)");
        }
   }
}
