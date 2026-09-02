## Part A
Create a `FitnessTracker` class that includes three data fields for a fitness activity: a `String` for the name of the activity as `activity`, an `int` for the number of minutes spent participating as `minutes`, and a `LocalDate` for the date as `date`. 



Create a default constructor that automatically sets the `activity` to **running**, the `minutes` to **0**, and the `date` to **January 1** of the current year. Overload the constructor so it receives parameters for each of the fields and assigns them appropriately.

Includes methods to get each data field. 

## Part B
Create an application that instantiates two `FitnessTracker` objects. Prompt the user for values for one object, and pass those values to the three constructor parameters. Retain the default constructor values for the other object. Display the values for each object. 

An example of the program is shown below: 
```
Enter activity >> swimming
Enter minutes spent swimming >> 90
Enter month >> 2
Enter day >> 24
Enter year >> 2021
Activity log:
swimming 90 minutes on 2021-02-24
running 0 minutes on 2021-01-01
```

