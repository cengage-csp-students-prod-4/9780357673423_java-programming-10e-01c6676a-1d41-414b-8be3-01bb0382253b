import java.util.*;
public class BonusBug06 
{
    public static void main(String args[])
    {
        int guess_number;
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter your guessed number from 1 - 100");
        guess_number = keyboard.nextInt();
        while(guess_number < 1 && guess_number > 100)
        {
            System.out.println("You entered " + guess_number + " this number is invalid as it is not in the range (1 - 100)");
            System.out.print("Please reenter your guessed number within the range (1 - 100)");
            number = kb.nextInt();
        }
        System.out.println("your guessed number is: " + guess_number);
    }
}