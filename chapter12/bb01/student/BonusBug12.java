import java.io.*;
import java.util.Scanner;

class BonusBug12 {
    
    // Algorithm for displaying the visual pattern using recursion 
    static void displayVizRecursion(int n, int i)
    {   
        
        //If the user enters zero - then the program will end.
        if (n < 1)
          return; 
        
        if (i <= n)
        {
            System.out.print ( "* "); // Display star for the row
            displayVizRecursion(n, i - 1); 
        }   
        else
        { 
            System.out.println( );  
            displayVizRecursion(n - 1, 1); // calling recursive method to display the remaining pattern of the star

        }
    }
    
    // Implementation - Recursive algorithm demonstration for creating visual patterns
    public static void main (String[] args)
    {
        int number;

        System.out.println("Enter a number between (2-20) for the first row display");
        Scanner kybd = new Scanner(System.out);
        number = kybd.nextInt();

        displayVizRecursion(number, 1); // calling the recursive method
        
    }
}
