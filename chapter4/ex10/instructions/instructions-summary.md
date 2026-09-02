## Part A
Create a class named `Person` that holds two `String` objects for the person’s first and last name (`firstName` and `lastName`). Include a blank constructor that takes no parameters and an overloaded constructor that requires an argument for each field. 

Include a blank constructor that takes no parameters and an overloaded constructor that requires an argument for each field. 

Include get methods for each field.

## Part B
Create a class named `Couple` that contains two `Person` objects that represent a bride and a groom (`bride` and `groom`). 

Include a default constructor that takes no parameters and an overloaded constructor that requires two `Person` objects. 

Include two get methods that each return a `Person` object.

## Part C
Create a class named `Wedding` for a wedding planner. The class includes the date of the wedding as `weddingDate`, the names of the couple being married as a `Couple` object, and a `String` for the location as `location` (for example, Smalltown VFW Hall). 

Provide a default constructor that takes no parameters and an overloaded constructor that requires a `Couple`, a `LocalDate`, and a `String` that contains data about a `Wedding` event. 

Include get methods that return the `Couple`, the `LocalDate`, and the `String` that represents the location.

Write a program called `TestWedding` that prompts the user for data, creates a `Wedding` object, and displays all the details.

An example of the program is shown below:
```
Enter month of wedding 9 
Enter day of wedding 13
Enter year of wedding 2023
Enter first name of bride >> Jane
Enter last name of bride >> Doe
Enter first name of groom >> John
Enter last name of groom >> Smith
Enter location of wedding >> 567 Main St. 

Doe/Smith Wedding
Date: 2023-09-13   Location: 567 Main St.
Bride: Jane Doe
Groom: John Smith
```

