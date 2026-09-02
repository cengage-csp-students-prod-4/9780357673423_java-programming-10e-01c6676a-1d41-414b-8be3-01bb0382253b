In a “You Do It” section of this chapter, you created a `CalculatorDemo` program that asked the user to solve an arithmetic problem and provided the Windows system calculator for assistance. Now, copy the contents of the *CalculatorDemo.java* file into the *CalculatorDemo2.java* file and modify the program to include the following improvements:

* Both numbers in the arithmetic problem should be random integers between 1 and 5,000.
* The program should ask the user to solve five problems.
* The program should handle any non-integer data entry by displaying an appropriate message and continuing with the next problem.

> Change the `Runtime.getRuntime().exec()` statement to the following: `Runtime.getRuntime().exec("xcalc");`.

An example of the program is shown below: 
```
What is the sum of 4641 and 3719? >> 8360
Correct!
What is the sum of 804 and 1861? >> 2665
Correct!
What is the sum of 4121 and 4008? >> eight one two nine
Invalid answer. Try again.
What is the sum of 2249 and 4449? >> 6698
Correct!
What is the sum of 4904 and 654? >> 5558
Correct!
```

