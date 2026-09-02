## Part A
Create a `UsedCarException` class that extends `Exception`; its constructor receives a value for a vehicle identification number (VIN) that is passed to the parent constructor so it can be used in a `getMessage()` call.

## Part B
Create a `UsedCar` class with fields for a VIN (`vin`), make (`make`), year (`year`), mileage (`mileage`), and price (`price`). 

The `UsedCar` constructor throws a `UsedCarException` when:

* the VIN is not four digits,
* the make is not Ford, Honda, Toyota, Chrysler, or Other,
* the year is not between 1997 and 2024 inclusive,
* the mileage or price are negative values.


## Part C
Write an application called `ThrowUsedCarException` that establishes an array of at least seven `UsedCar` objects and prompts the user for values. Include two catch blocks. One catches any data entry `Exception` and displays a message. The other catches any `UsedCarException` that is thrown from the `UsedCar` constructor. When data entry is complete, display a list of only the `UsedCar` objects that were constructed successfully.

An example of the program is shown below:
```
Enter 4-digit VIN >> 9478
Enter make >> Ford
Enter year >> 1999
Enter mileage >> 212000
Enter price >> 3000
Enter 4-digit VIN >> 123
Enter make >> Dodge
Enter year >> 1998
Enter mileage >> 128000
Enter price >> 6000
Object creation error: Error in used car #123
Enter 4-digit VIN >> 8173
Enter make >> GM
Enter year >> 2002
Enter mileage >> 184000
Enter price >> 3400
Object creation error: Error in used car #8173
Enter 4-digit VIN >> 6451
Enter make >> Honda
Enter year >> 2015
Enter mileage >> 20,300
Enter price >> 14000
Enter 4-digit VIN >> 3613
Enter make >> Toyota
Enter year >> 2020
Enter mileage >> 2000
Enter price >> 34000
Enter 4-digit VIN >> 3136
Enter make >> 6085
Enter year >> Chrysler
Data entry error
Enter 4-digit VIN >> 2499
Enter make >> Other
Enter year >> 2008
Enter mileage >> 70000
Enter price >> 6000

Good used car values
VIN 9478  Make: Ford
   Year: 1999  212000 miles   $3000
VIN 6451  Make: Honda
   Year: 2015  20300 miles   $14000
VIN 3613  Make: Toyota
   Year: 2020  2000 miles   $34000
VIN 2499  Make: Other
   Year: 2008  70000 miles   $6000
```

