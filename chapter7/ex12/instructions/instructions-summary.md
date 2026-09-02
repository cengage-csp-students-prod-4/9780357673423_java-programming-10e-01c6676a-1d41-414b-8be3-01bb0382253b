## Part A
Create a `TaxReturn` class with fields that hold a taxpayer’s Social Security number, last name, first name, street address, city, state, zip code, annual income, marital status, and tax liability. 

Include a constructor that requires arguments that provide values for all the fields other than the tax liability. The constructor calculates the tax liability based on annual income and marital status. The following table shows the percentage of income that is taxed.

Income ($) | Single Status | Married Status 
-----------|---------------|---------------
0-20,000 | 15% | 14% 
20,001-50,000 | 22% | 20%
50,001 and over | 30% | 28%

In the `TaxReturn class`, also include a display method that displays all the `TaxReturn` data.

## Part B
Create an application called `PrepareTax` that prompts a user for the data needed to create a `TaxReturn`. Continue to prompt the user for data as long as any of the following are true:

* The Social Security number is not in the correct format, with digits and dashes in the appropriate positions—for example, 999-99-9999.
* The zip code is not five digits.
* The marital status does not begin with one of the following: S, s, M, or m.
* The annual income is negative.

> The `PrepareTax` program should prompt the user for the data fields in the order shown the example below. 

An example of the program is shown below: 
```
Enter your Social Security number >> 999-99-9999
Enter your first name >> Javier
Enter your last name >> Abioye
Enter your address >> 2 1st St. 
Enter your city >> Duxborough 
Enter your state >> Vermont 
Enter your zip code >> 00000
Enter marital status >> Single
Enter your annual income >> 72000
Taxpayer ssn: 999-99-9999 Javier Abioye
12 End of the Rd.
Duxbourogh, Vermont 00000
 Marital status: S
Income: $72000.0  Tax: $21600.0
```


