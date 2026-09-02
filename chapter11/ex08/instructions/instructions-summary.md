## Part A
The Rochester Bank maintains customer records in a random access file called *BankAccounts.txt*. Write an application called `CreateBankFile` that creates 10,000 blank records and then allows the user to enter customer account information, including an account number that is **9998** or less, a last name, and a balance. Insert each new record into a data file at a location that is equal to the account number. Assume that the user will not enter invalid account numbers. Force each name to eight characters, padding it with spaces or truncating it if necessary. Also assume that the user will not enter a bank balance greater than **99,000.00**. Allow the user to enter new accounts until the terminating value **9999** is entered. 

> The default file path for your project directory is `./`. 

An example of the program is shown below: 
```
Enter 4-digit customer account number less than 9999 >> 63
Enter name for customer >> Yeukai
Enter balance >> 45427.05
Enter next customer account number or 9999 to quit >> 1361
Enter name for customer >> Pham
Enter balance >> 32013
Enter next customer account number or 9999 to quit >> 7137
Enter name for customer >> Moran
Enter balance >> 52132.83
Enter next customer account number or 9999 to quit >> 9999
```

An example of the *BankAccounts.txt** file is shown below:
```
0000,        ,00000.00
0000,        ,00000.00
0063,Yeukai  ,45427.05
0000,        ,00000.00
0000,        ,00000.00
```

> The entry above would be the 64th entry (line) in the file using a 0 based index.

## Part B
Create an application called `ReadBankAccountsSequentially` that uses the file created by the user in *part A* and displays all existing accounts in account-number order.

An example of the program is shown below: 

```
ID#63  Yeukai   $45427.05
ID#1361  Pham   $32013.0
ID#7137  Moran   $52132.83
```

## Part C
Create an application called `ReadBankAccountsRandomly` that uses the file created by the user in *part A* and allows the user to enter an account number to view the account balance. Allow the user to view additional account balances until entering an application-terminating value of **9999**.

An example of the program is shown below:
```
Enter account number >> 7137
ID #7137  7137,Moran,52132.83

Enter next account number or 9999 to quit >> 9999
```

