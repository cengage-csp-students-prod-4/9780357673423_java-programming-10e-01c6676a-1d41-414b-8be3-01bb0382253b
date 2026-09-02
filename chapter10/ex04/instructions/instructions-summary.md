Write a program called `DistanceFromAverageWithExceptionHandling` that prompts the user to enter an integer that represents an array size. 

Java generates a `NumberFormatException` if the user attempts to enter a non-integer value using `nextInt()`. Handle this exception by displaying the following error message: "**Invalid value for array size**". If the size entered is an integer, create an array of type `double` using the integer entered as the size. 

Java generates a `NegativeArraySizeException` if you attempt to create an array with a negative size; handle this exception by setting the array size to a default value of five. If the array is created successfully, use exception-handling techniques to ensure that each entered array value is a `double`. 

Use the sentinel value **99999** to stop prompting the user for input values. Then calculate each element’s distance from the average.

Examples of the program are shown below: 
```
Please enter a value for the array size >> Mike
Invalid value for array size
```
```
Please enter a value for the array size >> 3
Enter a numeric value or 99999 to quit >> 1
Enter next numeric value or 99999 to quit >> 2
Enter next numeric value or 99999 to quit >> 3
You entered 3 numbers and their average is 2.0
1.0 is 1.0 away from the average
2.0 is 0.0 away from the average
3.0 is -1.0 away from the average
```

