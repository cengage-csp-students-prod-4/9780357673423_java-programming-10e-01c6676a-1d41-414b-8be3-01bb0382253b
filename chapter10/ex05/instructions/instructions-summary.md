Write an application called `SqrtException` that prompts the user to enter an integer and displays its square root. Accept the user’s entry as a `String` using the `nextLine()` method. Then try to use the `Integer.parseInt()` method to convert the `String` to an `int`. If the conversion throws an `Exception`, display an error message, and set the number to **0**. 

Then, if the entered number is less than 0, throw an `ArithmeticException` to a `catch` block that displays the following message: "**Can't take the square root of a negative number**".

If the entered number is not less than 0, take the square root of the number using the `Math.sqrt()` method, and display the result.

Examples of the program are shown below: 
```
Enter an integer >> 23
Square root of 23.0 is 4.795831523312719
```
```
Enter an integer >> -21
Can't take square root of negative number
```

