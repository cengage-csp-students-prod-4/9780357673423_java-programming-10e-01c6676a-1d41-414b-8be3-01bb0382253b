import java.util.*;
public class BonusBug08
{
    public static void main(String args[])
    {
double[] rainFall = {7.1,5.0,5.7,4.8,3.2,2.6,1.1,1.5,2.6,5.6,8.1,7.2};
int total = 0;
for (int index = 0; index<=12; index++)
total += rainFall[index];

System.out.println("Seattle's total rainfall in a year is: " + total + " inches.");

/* Let's find the average rainfall per month in Seattle //
 double average = 0;
 average = total / rainFall.length;

 System.out.println("Average rainfall per month in Seattle is: " + average + " inches.");

/* Let's find the highest rainfall in a month in Seattle */
double highest;
highest = rainFall[0];
for (int index = 1; index<12; index++)
{
    if (rainFall[index] < highest)
    highest = rainFall[index];
}
System.out.println("Highest rainfall in a month in Seattle was: " + highest + " inches.");
    
    }
}