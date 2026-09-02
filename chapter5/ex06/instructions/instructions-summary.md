Create the `AcmePay` program for Acme Parts, which runs a small factory and employs workers who are paid one of three hourly rates depending on their shift: 

1. first shift, **$17** per hour,
2. second shift, **$18.50** per hour,
3. third shift, **$22** per hour. 

Each factory worker might work any number of hours per week and any hours greater than **40** are paid at one and one-half times the usual rate. In addition, second-shift and third-shift workers can elect to participate in the retirement plan, for which **3%** percent of the worker’s gross pay is deducted from the paychecks. Write the `AcmePay` program that prompts the user for hours worked and the shift number; if the shift number is **2** or **3**, prompt the user to enter the worker’s choice to participate in the retirement plan (**1** for "yes", **2** for "no"). Display (1) the hours worked, (2) the shift, (3) the hourly pay rate, (4) the regular pay, (5) overtime pay, (6) the total of regular and overtime pay, (7) the retirement deduction, if any, and (8) the net pay.

An example of the program is shown below: 
```
Please enter shift - 1, 2, or 3 >> 3
Please enter hours worked (can be a fraction) >> 55
Do you want to participate in the retirement plan?
   Enter 1 for Yes and 2 for No >> 1
Hours worked is    55.0
Shift:             3
Hourly pay rate is 22.0
Regular pay is     880.0
Overtime pay is    495.0
Retirement deduction is 41.25
     Net pay is..............1333.75
```

