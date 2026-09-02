## Part A
Write a program called `CreateCustomerFile` that allows you to create a file of customers called *Customers.txt* for a company. The first part of the program should create an empty file suitable for writing a three-digit ID number, six-character last name, and five-digit zip code for each customer. 

The second half of the program accepts user input to populate the file. For this exercise, assume that the user will correctly enter ID numbers and zip codes, but force the customer name to six characters if it is too long or too short. Issue an error message, and do not save the records if the user tries to save a record with an ID number that already has been used. Continue to prompt the user for record values until the terminating value of **999** is entered.

> The default file path for your project directory is `./`. 

An example of the program is shown below:
```
Enter customer number or 999 to quit >> 361
Enter name for customer #361 >> Chetrit
Enter zip code >> 37972
Enter next customer number or 999 to quit >> 486
Enter name for customer #486 >> Princewill
Enter zip code >> 95043
Enter next customer number or 999 to quit >> 840
Enter name for customer #840 >> Bensimon
Enter zip code >> 46229
Enter next customer number or 999 to quit >> 140
Enter name for customer #140 >> Banh
Enter zip code >> 83925
Enter next customer number or 999 to quit >> 999
```

An example of the *Customer.txt* file is shown below:
```
000,      ,00000
000,      ,00000
361,Chetri,37972
000,      ,00000
000,      ,00000
```

> The entry above would be the 362nd entry (line) in the file using a 0 based index.

## Part B
Write a program called `CreateItemFile` that creates a file of items carried by the company called *Items.txt*. Include a three-digit item number and up to a 20-character description for each item. Issue an error message if the user tries to store an item number that already has been used. Continue to prompt the user for item values until the terminating value of **999** is entered.

An example of the program is shown below:
```
Enter item number or 999 to quit >> 734
Enter description for item #734 >> Used book with moderate wear. 
Enter next item number or 999 to quit >> 67
Enter description for item #67 >> Custom book marks.
Enter next item number or 999 to quit >> 241
Enter description for item #241 >> Chess set.
Enter next item number or 999 to quit >> 999
```

An example of *Items.txt* is shown below:
```
000,                    
000,                    
67,Custom book marks.  
000,                    
000,
```
> The entry above would be the 68th entry (line) in the file using a 0 based index.

## Part C
Write an application called `CustomerItemOrder` that takes customer orders. Allow a user to enter a customer number and item ordered. Display an error message if the customer number does not exist in the customer file or the item does not exist in the item file; otherwise, display all the customer information and item information. Continue to prompt the user for customer and item values until the terminating value of **999** is entered.

An example of the program is shown below:
```
Enter customer number or 999 to quit >> 840
Enter item number >> 734
Customer: 840   Name: Bensim   zip code: 46229
  ordered Item #734 which is a Used book

Enter customer ID number or 999 to quit >> 999
```

