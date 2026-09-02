/* In this exercise, you will also read a text data file (CusDiscount.txt) sequentially 
   to display the information for each line, and then finally display the total number of records
    in the data file.You will use try and catch blocks to capture any input/output file related errors.
*/
 
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class BonusBug11
{
    public static void main(String[] args)
    {
        Path file =
            Paths.get("/home/nt-user/workspace/ /CusDiscountFile); //Path to the data file – CusDiscountFile.txt
        String[] cusDisRec = new String[2];  //cusDisRec will store the data values as string array
        String cusDis = "";
        String delimiter = ",";  //delimiter of the data file values
        String cusId, discount;
        int count;

        try
        {
            InputStream input = new
            BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new
            BufferedReader(new InputStreamReader(input));
            System.out.println();
            cusDis = read.readLine();
            while(cusDis != null)
            {
                cusDisRec = cusDis.split(delimiter);  //splits the data values by delimiter
                cusId = cusDisRec[0]; //stores the value of CusId
                discount = cusDisRec[2]; //stores the value of discount percentage

                System.out.println("Customer ID " + cusId + " gets " + discount + "% discount");
                cusDis = reader.readline(); //read the data file line.
                count = count +1; //counts the records
            }
            reader.close(); 
            System.out.println("There are "  count + " records in this file."); 
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
}
