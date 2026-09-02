Using a text editor, create a file called *AcctNumsIn.txt* that contains a list of at least 15 six-digit account numbers. Write a program called `ValidateCheckDigits` that reads in each account number in the file, and display whether the account number is valid. An account number is valid only if the last digit is equal to the remainder when the sum of the first five digits is divided by 10. For example, the number 223355 is valid because the sum of the first five digits is 15, the remainder when 15 is divided by 10 is 5, and the last digit is 5. Write only valid account numbers to an output file called *AcctNumsOut.txt*, each on its own line. 

An example of the program is shown below: 

```
345619 is valid
789400 is invalid
871208 is valid
901156 is valid
984334 is invalid
723422 is invalid
172257 is valid
100000 is invalid
273699 is invalid
237485 is invalid
761200 is invalid
555500 is valid
936716 is valid
763542 is invalid
999995 is valid
```