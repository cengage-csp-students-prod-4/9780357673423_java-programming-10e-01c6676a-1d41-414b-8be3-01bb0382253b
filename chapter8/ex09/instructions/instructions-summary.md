## Part A
Create a class named `Purchase`. Each `Purchase` contains an invoice number (`invoiceNumber`), amount of sale (`saleAmount`), and amount of sales tax (`tax`). Include set methods for the invoice number and sale amount. Within the set method for the sale amount, calculate the sales tax as 5 percent of the sale amount. Also include a display method that displays a purchase’s details.


## Part B
Write a program called `PurchaseArray` that declares an array of five Purchase objects and prompt a user for their values. As each Purchase object is created, continually prompt until the user enters an invoice number between **1000** and **8000** inclusive and a non-negative sale amount. Prompt the user for values for each object and then display all the values. 

An example of the program is shown below:

```
Enter invoice number >> 6136
Enter sale amount >> 10953.22
Enter invoice number >> 1889
Enter sale amount >> 8965.99
Enter invoice number >> 1781
Enter sale amount >> 4568.03
Enter invoice number >> 2471   
Enter sale amount >> 4737.27
Enter invoice number >> 2343
Enter sale amount >> 17195.12

Summary of purchases:
Invoice #6136  Amount of sale: $10953.22  Tax: $547.661
Invoice #1889  Amount of sale: $8965.99  Tax: $448.2995
Invoice #1781  Amount of sale: $4568.03  Tax: $228.4015
Invoice #2471  Amount of sale: $4737.27  Tax: $236.86350000000004
Invoice #2343  Amount of sale: $17195.12  Tax: $859.756
```

