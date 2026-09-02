## Scenario

You are a software developer and your client uses a program that stores the odd values in an array. You know that using arrays may also create an exception error when trying to access an index of the array and that index is out of bounds. In this exercise, the program will request an array size from the user, as well as the values to store in the array, and an index to retrieve a value.

## Instructions

In this exercise you will use `try` and `catch` blocks to handle an array out of bounds error - `ArrayOutOfBoundsException` and prevent it from crashing the program.

An example of the program is shown below:

```
Enter the size of the array >> 10
Enter 10 integers >>
1
3
5
7
9
11
13
15
17
19
Enter an index to retrieve >>
10
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
```
