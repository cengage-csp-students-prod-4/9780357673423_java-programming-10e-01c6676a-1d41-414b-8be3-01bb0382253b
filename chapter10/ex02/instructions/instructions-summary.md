The `Double.parseDouble()` method requires a `String` argument, but it fails if the `String` cannot be converted to a floating-point number. Write an application called `TryToParseDouble` in which you try accepting a `double` input from a user and catch a `NumberFormatException` if one is thrown. The `catch` block forces the number to **0** and displays an appropriate error message. Following the catch block, display the number.

Examples of the program are shown below: 

```
Enter a floating point number >> 5.2
Number is 5.2
```
```
Enter a floating point number >> Hello
Value entered cannot be converted
   to a floating-point number
Number is 0.0
```


