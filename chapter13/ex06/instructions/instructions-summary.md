## Part A
Roberto has purchased buildings that contain apartments to rent. Create an `Apartment` class that contains fields for the street address (`address`), apartment number (`aptNumber`), monthly rent amount (`rent`), and number of bedrooms (`bedrooms`) for each `Apartment` that he owns. Include a constructor that assigns field values to the class, a `toString()` method that displays the `Apartment` values, and a `compareTo()` method that compares `Apartment` objects based on the rent value. Include any other methods that you think you might need.


## Part B
Write an application called `ApartmentsLinkedList` that contains a `LinkedList` in which to store `Apartment` objects. Prompt the user for values for `Apartment` objects and add them to the `LinkedList` until the sentinel value **ZZZ** is entered. Sort the `Apartment` objects by rent value, and then display the sorted list.

An example of the program is shown below: 
```
Enter street address for apartment or ZZZ to quit >> 123 A Street
Enter apartment number >> 321
Enter rent >> 1100.01
Enter number of bedrooms >> 2
Enter street address for apartment or ZZZ to quit >> 456 B Street
Enter apartment number >> 654
Enter rent >> 1885.83
Enter number of bedrooms >> 3
Enter street address for apartment or ZZZ to quit >> 789 B Street
Enter apartment number >> 987
Enter rent >> 2300.27
Enter number of bedrooms >> 2
Enter street address for apartment or ZZZ to quit >> ZZZ

123 A Street Apt number 321
   Rent $1100.01 2 bedrooms
456 B Street Apt number 654
   Rent $1885.83 3 bedrooms
789 B Street Apt number 987
   Rent $2300.27 2 bedrooms
```


## Part C
Roberto sometimes sells one of his buildings. Copy the contents of the *ApartmentsLinkedList.java* file into the *ApartmentsLinkedList2.java* file and modify the `ApartmentsLinkedList` application so that after data entry is complete and the list of `Apartment` objects is displayed, the application prompts the user for a street address to eliminate. Remove all the `Apartment` objects at the specified street address, and display the list of Apartments again. Rename the class to `ApartmentsLinkedList2`. 

An example of the program is shown below: 
```
Enter street address for apartment or ZZZ to quit >> 123 A Street
Enter apartment number >> 321
Enter rent >> 1100.01
Enter number of bedrooms >> 2
Enter street address for apartment or ZZZ to quit >> 456 B Street
Enter apartment number >> 654
Enter rent >> 1885.83
Enter number of bedrooms >> 3
Enter street address for apartment or ZZZ to quit >> 789 B Street
Enter apartment number >> 987
Enter rent >> 2300.27 
Enter number of bedrooms >> 2
Enter street address for apartment or ZZZ to quit >> ZZZ


List of apartments
123 A Street Apt number 321
   Rent $1100.01 2 bedrooms
456 B Street Apt number 654
   Rent $1885.83 3 bedrooms
789 B Street Apt number 987
   Rent $2300.27 2 bedrooms

Enter address to remove >> 456 B Street

List of apartments
123 A Street Apt number 321
   Rent $1100.01 2 bedrooms
789 B Street Apt number 987
   Rent $2300.27 2 bedrooms
```

