Create a class named `Purchase`. Each `Purchase` contains an invoice number (`invoiceNumber`), amount of sale (`saleAmount`), and amount of sales tax (`tax`). Include set and get methods for the invoice number and sale amount. Within the set method for the sale amount, calculate the sales tax as **5** percent of the sale amount. Also include a display method that displays a purchase’s details. 

Next, create an application called `CreatePurchase` that declares a `Purchase` object and prompts the user for purchase details. When you prompt for an invoice number, do not let the user proceed until a number between **1,000** and **8,000** inclusive has been entered. When you prompt for a sale amount, do not proceed until the user has entered a nonnegative value. After a valid `Purchase` object has been created, display the object’s invoice number, sale amount, and sales tax. 

An example of the code is shown below:

```
Enter invoice number >> 2385
Enter sale amount >> 4081.28
Invoice #2385  Amount of sale: $4081.28  Tax: $204.06400000000002
```

