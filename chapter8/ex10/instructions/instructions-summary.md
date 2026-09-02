## Part A

Each week, the Pickering Trucking Company randomly selects one of its 30 employees to take a drug test. Write an application called `DrugTests` that determines which employee will be selected each week for the next 52 weeks. Use the `Math.random()` function explained in *Appendix D* to generate an employee number between 1 and 30; you use a statement similar to:

```
testedEmployee = 1 + (int)(Math.random() * 30);
```
After each selection, display the number of the employee to test. Display **four** employee numbers on each line. It is important to note that if testing is random, some employees will be tested multiple times, and others might never be tested. Include a count and display of the number of times each employee is selected. Also display a list of employee numbers that never were selected for testing.

An example of the program is shown below:
```
week 1 Emp # 20      week 2 Emp # 26      week 3 Emp # 14      week 4 Emp # 8      
week 5 Emp # 6      week 6 Emp # 3      week 7 Emp # 22      week 8 Emp # 30 
...
Employee #1 is tested 1 time(s).  Employee #2 is tested 0 time(s).  Employee #3 is tested 1 time(s).  
Employee #4 is tested 1 time(s).  Employee #5 is tested 1 time(s).  Employee #6 is tested 3 time(s). 
...
```

> The example above does not include all of the program's output.


## Part B

When a series of random numbers is generated, it is quite common for the same number to be selected consecutively multiple times. Although duplicates happen in randomized lists, humans tend to see such repetition as “unfair.” 

Copy the code from *DrugTests.java* into the *DrugTests2.java* file and modify the `DrugTests` class so that if an employee number is selected immediately after it was already selected, a new number is selected for the week. Also display a message explaining that a new number is being selected. Rename the class `DrugTests2`. 

An example of program is shown below:
```
week 1 Emp # 21      week 2 Emp # 17      week 3 Emp # 1      week 4 Emp # 2      
week 5 Emp # 14      week 6 Emp # 26      week 7 Emp # 28      week 8 Emp # 6      
Employee #6 was selected two weeks in a row -- making new selection
...
week 49 Emp # 23      Employee #23 was selected two weeks in a row -- making new selection
week 50 Emp # 22      week 51 Emp # 28      week 52 Emp # 10      
Employee #1 is tested 2 time(s).  Employee #2 is tested 4 time(s).  Employee #3 is tested 1 time(s).  
Employee #4 is tested 0 time(s).  Employee #5 is tested 1 time(s).  Employee #6 is tested 2 time(s). 
...
Employee #25 is tested 2 time(s).  Employee #26 is tested 3 time(s).  Employee #27 is tested 1 time(s).  
Employee #28 is tested 3 time(s).  Employee #29 is tested 1 time(s).  Employee #30 is tested 1 time(s).  
List of employees never tested during the year:
Emp #4   Emp #7   Emp #9   Emp #13   Emp #18
```

> The example above does not include all of the program's input or output.

