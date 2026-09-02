## Part A
Create an `Automobile` class for a dealership. Include fields for an ID number (`id`), make (`make`), model (`model`), color (`color`), year (`year`), and miles per gallon (`mpg`). 

Include get and set methods for each field. Do not allow the ID to be negative or more than **9999**; if it is, set the ID to **0**. Do not allow the year to be earlier than **2005** or later than **2024**; if it is, set the year to **0**. Do not allow the miles per gallon to be less than **10** or more than **60**; if it is, set the miles per gallon to **0**. 


Include a default constructor that accepts no arguments and an overloaded constructor that accepts arguments for each field value and uses the set methods to assign the values. 


## Part B
Write an application called `TestAutomobiles` that declares two Automobile objects. Write a function called `enterData()` that prompts the user for the data values for an `Automobile` object and returns that object. When you test the program, be sure to enter some invalid data to demonstrate that all the methods work correctly.

An example of the program is shown below:
```
Enter ID (an integer) >> 12
Enter make >> Mercury
Enter model >> Monterey
Enter color >> Dark Blue
Enter year (4 digits) >> 2007
Enter mpg >> 17
Enter ID (an integer) >> 599   
Enter make >> Pontiac
Enter model >> G5
Enter color >> White
Enter year (4 digits) >> 2006
Enter mpg >> 25

ID#12 Mercury Monterey Dark Blue 2007 17.0 miles per gallon
ID#599 Pontiac G5 White 2006 25.0 miles per gallon
```



