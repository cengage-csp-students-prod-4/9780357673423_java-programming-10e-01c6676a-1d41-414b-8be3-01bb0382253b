## Part A
Create a class named `Salesperson`. Data fields for Salesperson include an `int` ID number (`id`) and a `double` annual sales amount (`sales`). Methods include a blank default constructor and a constructor that requires values for both data fields, as well as get and set methods for each of the data fields.

Write an application named `DemoSalesperson` that declares an array of 10 Salesperson objects named `salesPeople`. Set each ID number to **9999** and each sales value to **0**. Display the 10 Salesperson objects. 

An example of the program is shown below:
```
Salesperson 0 has ID #9999 and annual sales of $0.0
Salesperson 1 has ID #9999 and annual sales of $0.0
Salesperson 2 has ID #9999 and annual sales of $0.0
Salesperson 3 has ID #9999 and annual sales of $0.0
Salesperson 4 has ID #9999 and annual sales of $0.0
Salesperson 5 has ID #9999 and annual sales of $0.0
Salesperson 6 has ID #9999 and annual sales of $0.0
Salesperson 7 has ID #9999 and annual sales of $0.0
Salesperson 8 has ID #9999 and annual sales of $0.0
Salesperson 9 has ID #9999 and annual sales of $0.0
```

## Part B
Copy the code from the *DemoSalesperson.java* file into the *DemoSalesperson2.java* file and modify the application so each `Salesperson` has a successive ID number from 111 through 120 and a sales value that ranges from $25,000 to $70,000, increasing by $5,000 for each successive Salesperson. Rename the class `DemoSalesperson2`. 

An example of the program is shown below: 
```
Salesperson 0 has ID #111 and annual sales of $25000.0
Salesperson 1 has ID #112 and annual sales of $30000.0
Salesperson 2 has ID #113 and annual sales of $35000.0
Salesperson 3 has ID #114 and annual sales of $40000.0
Salesperson 4 has ID #115 and annual sales of $45000.0
Salesperson 5 has ID #116 and annual sales of $50000.0
Salesperson 6 has ID #117 and annual sales of $55000.0
Salesperson 7 has ID #118 and annual sales of $60000.0
Salesperson 8 has ID #119 and annual sales of $65000.0
Salesperson 9 has ID #120 and annual sales of $70000.0
```

## Part C
Create an application called `SalespersonSort` that allows a user to enter values for an array of seven `Salesperson` objects. Offer the user the choice of displaying the objects in order by either ID number or sales value.

An example of the program is shown below: 

```
Enter an ID number >> 111
Enter a sales value >> 22000
Enter an ID number >> 181
Enter a sales value >> 20000
...
By which field do you want to sort?
(I)d number or (S)ales >> I
ID 111  sales: 22000.0
ID 181  sales: 20000.0
...
```

> The example above does not include all of the program's input or output.

## Part D
Create an application called `SalespersonDatabase` that allows you to store an array that acts as a database of any number of `Salesperson` objects up to 20. While the user decides to continue, offer three options: to add a record to the database, to delete a record from the database, or to change a record in the database. Then proceed as follows:

* If the user selects the add option, issue an error message if the database is full. Otherwise, prompt the user for an ID number. If the ID number already exists in the database, issue an error message. Otherwise, prompt the user for a sales value and add the new record to the database.

* If the user selects the delete option, issue an error message if the database is empty. Otherwise, prompt the user for an ID number. If the ID number does not exist, issue an error message. Otherwise, do not access the record for any future processing.

* If the user selects the change option, issue an error message if the database is empty. Otherwise, prompt the user for an ID number. If the requested record does not exist, issue an error message. Otherwise, prompt the user for a new sales value and change the sales value for the record.

* After each option executes, display the updated database in ascending order by Salesperson ID number and prompt the user to select the next action.

An example of the program is shown below: 

```
Do you want to (A)dd, (D)elete, or (C)hange a record or (Q)uit >> A
Enter salesperson ID >> 121
Enter sales >> 13000

Current database:
ID #121   $13000.0

Do you want to (A)dd, (D)elete, or (C)hange a record or (Q)uit >> C
Enter ID to change >> 121
Enter sales >> 12000

Current database:
ID #121   $12000.0

Do you want to (A)dd, (D)elete, or (C)hange a record or (Q)uit >> D
Enter ID to delete >> 121

Current database:

Do you want to (A)dd, (D)elete, or (C)hange a record or (Q)uit >> Q
```

