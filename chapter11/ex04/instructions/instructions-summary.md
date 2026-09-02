## Part A
Create a program called `WriteCustomerList.java` that allows a user to input customer records (ID number, first name, last name, and balance owed) ending with the sentinel value **ZZZ**. Save each record to a file called *CustomerList.txt*. When you execute the program, be sure to enter multiple records that have the same last name because you will search for repeated names in **Part D** of this exercise.

> The default file path for your project directory is `./`. 

An example of the program is shown below:
```
Enter ID number or ZZZ to quit >> 712
Enter first name >> Janna
Enter last name >> Cao
Enter balance >> 564.42 
Enter ID number or ZZZ to quit >> 70
Enter first name >> Linh    
Enter last name >> Cao
Enter balance >> 743.14
Enter ID number or ZZZ to quit >> 979
Enter first name >> Valorie 
Enter last name >> Watts
Enter balance >> 837.96
Enter ID number or ZZZ to quit >> 444
Enter first name >> Johnna
Enter last name >> Dambudzo
Enter balance >> 238.62
Enter ID number or ZZZ to quit >> ZZZ
```


## Part B
Write an application called `DisplaySavedCustomerList` that reads the file created by the `WriteCustomerList` application and displays the records.

An example of the program is shown below: 
```
712  Janna  Cao  564.42  
70  Linh  Cao  743.14  
979  Valorie  Watts  837.96  
444  Johnna  Dambudzo  238.62  
```

## Part C
Write an application called `DisplaySelectedCustomer` that allows you to enter any ID number, reads the customer data file created in *step A*, and displays the data for the customer. Display an appropriate message if the ID number cannot be found in the input file.

An example of the program is shown below: 
```
Enter ID number to search for >> 70
70  Linh  Cao  743.14  
```

## Part D
Write an application called `DisplaySelectedCustomersByName` that allows you to enter any last name and displays all the data for customers with the given last name. Display an appropriate message if the name cannot be found in the input file.

An example of the program is shown below: 
```
Enter last name to search for >> Cao
712  Janna  Cao  564.42  
70  Linh  Cao  743.14 
```

## Part E
Write an application called `DisplaySelectedCustomersByBalance` that allows you to enter any purchase amount and displays all the data for customers with balances greater than the entered value. Display an appropriate message if no customers meet the criteria.

An example of the program is shown below: 
```
Enter minimum balance >> 750.00
979  Valorie  Watts  837.96  
```

