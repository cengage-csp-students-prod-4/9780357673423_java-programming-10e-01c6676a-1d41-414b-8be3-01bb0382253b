## Part A
Create a `DataEntryException` class whose `getMessage()` method returns information about invalid integer data.

## Part B
Write a program named `GetIDAndAge` that continually prompts the user for an integer ID number and an integer age until a terminal **0** is entered for both. Throw a `DataEntryException` if the ID is not in the range of valid ID numbers (0 through 999), or if the age is not in the range of valid ages (0 through 119). Catch any `DataEntryException` or `InputMismatchException` that is thrown, and display an appropriate message.

An example of the program is shown below: 
```
Enter 0 for both ID and age to quit
   Enter ID >> Gregg
Invalid data type

Enter 0 for both ID and age to quit
   Enter ID >> 268
   Enter age >> 120
Invalid age or ID - DataEntryException - 120

Enter 0 for both ID and age to quit
   Enter ID >> 1000
   Enter age >> 65
Invalid age or ID - DataEntryException - 1000

Enter 0 for both ID and age to quit
   Enter ID >> 741
   Enter age >> 40
ID 741 and age 40 both OK

Enter 0 for both ID and age to quit
   Enter ID >> 0
   Enter age >> 0
```

