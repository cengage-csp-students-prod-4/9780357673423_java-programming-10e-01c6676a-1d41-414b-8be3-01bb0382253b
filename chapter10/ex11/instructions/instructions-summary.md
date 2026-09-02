## Part A
Serendipity Gifts accepts user orders for its products interactively. Users might make the following errors as they enter data:

* The item number ordered is not numeric, too low (less than 0), or too high (more than 9999).
* The quantity is not numeric, too low (less than 1), or too high (more than 12).
* The item number is not a currently valid item.

Although the company might expand in the future, its current inventory consists of the items listed in the table below: 

Item Number | Price ($)
------------|----------
111 | 0.89
222 | 1.47
333 | 2.43
444 | 5.99

Create a class called `OrderMessages` that stores an array of usable error messages. 

## Part B
Create an `OrderException` class that accepts one of the messages as its parameter.

## Part C
Create an application called `PlaceAnOrder` that contains prompts for an item number and quantity. Allow for the possibility of nonnumeric entries as well as out-of-range entries and entries that do not match any of the currently available item numbers. The program should display an appropriate message stored in the `OrderMessages` class if an error has occurred. If no errors exist in the entered data, compute the user’s total amount due (quantity times price each) and display it.

Examples of the program are shown below:
```
Enter item number 111
Enter quantity 2
Order OK. Total is $1.78
  (2 at $0.89 each)
```
```
Enter item number 123 
Enter quantity 1
Message is: Item number does not exist 
```

