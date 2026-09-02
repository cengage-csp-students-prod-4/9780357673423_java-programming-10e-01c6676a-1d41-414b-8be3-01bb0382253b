import java.util.*;
import java.util.Scanner;
public class BonusBug07 
{
    public static void main(String args[]) 
    {
        Scanner kb = new Scanner(System.in);
        String orderId; //hold the value of orderId
        String state; //hold the value of state
        String airportCode; //hold the value of airport code
        String stateAirport; //hold the value state and airport code with dash
        int totalLength;

        System.out.println("Enter an order code: ");
        orderId = kb.nextLine();
        totalLength = OrderId.length();

        //Using length method to check for an empty string
        if (orderId.length() = 0)
         System.out.println("You must enter an order id.");

         //Use substring method to extract the characters for state
          state = orderId.substring(1,2);
          System.out.println("Order is from" + " " + state + " state");

         //Use substring method to extract the characters for airport code
          airportCode = orderId.substring(2, 4);
          System.out.println("Order is closest to " + airportCode + " airport");

          /Add a dash between state and airport code
    stateAirport = state + "-"airportCode;
        System.out.println("Two substrings are now joined with dash between two codes " + stateAirports);
    }
}