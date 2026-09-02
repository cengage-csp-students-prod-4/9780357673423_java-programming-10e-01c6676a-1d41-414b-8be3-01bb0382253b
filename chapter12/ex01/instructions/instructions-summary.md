## Part A
Write a program called `AddingRecursively` that prompts a user for two integers and then sums all the values between and including the two integers. Ensure that the second integer entered is larger than the first by continuing to re-prompt the user until it is. Then pass the two integers to a recursive method called `sum()` that returns the sum of the integers to the `main()` method, where it is displayed. The method works by adding each integer in the set to the running sum of all the integers that are larger. You can accomplish this by continually passing two values to the method: the low value and the value that is one less than the current high value. The base case occurs when the second value passed is no longer greater than the first.

An example of the program is shown below:
```
Enter a number >> 2
Enter another number that is larger >> 13
The sum of all the numbers between 
     2 and 13 is 90
```

## Part B
Copy the contents of the *AddingRecursively.java* file into the *AddingRecursively2.java* file and modify the `AddingRecursively` class so that the program accepts any two integers from the user without requiring the user to make sure the second value is larger than the first. Name the new program as `AddingRecursively2`.

An example of the program is shown below: 
```
Enter a number >> 6
Enter another number >> 2
The sum of all the numbers between 
     2 and 6 is 20
```

