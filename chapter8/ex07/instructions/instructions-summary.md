Write an application called `BirthdayReminder` that allows a user to enter the names and birthdates of up to 10 friends. Continue to prompt the user for names and birthdates until the user enters the sentinel value **ZZZ** for a name or has entered 10 names, whichever comes first. When the user is finished entering names, produce a count of how many names were entered, and then display the names. 

In a loop, continually ask the user to type one of the names and display the corresponding birthdate. If there is no corresponding birthdate, display the error message "**Sorry, no entry for x**" where "x" is the name not been previously entered. The loop continues until the user enters **ZZZ** for a name. 

An example of the program is shown below:

```
Enter a name >> Noelia 
Enter birthdate with slashes between the month, day, and year >> 4/4/1979
Enter a name or ZZZ to quit >> Rodger
Enter birthdate with slashes between the month, day, and year >> 6/30/1980
Enter a name or ZZZ to quit >> Giovanni
Enter birthdate with slashes between the month, day, and year >> 11/16/1986
Enter a name or ZZZ to quit >> ZZZ

Count of names entered: 3
Noelia 
Rodger
Giovanni

Enter a name to search for or ZZZ to quit >> Rodger
Rodger's birthdate is 6/30/1980
Enter a name to search for or ZZZ to quit >> ZZZ
```

> Your program should accept dates in the format `MM/DD/YYYY`. 

