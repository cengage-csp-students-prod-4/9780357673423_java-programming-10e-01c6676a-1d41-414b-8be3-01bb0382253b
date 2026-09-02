Write a program called `RemoveWords` that creates a `String` `ArrayList`. Continually prompt the user for `String` values to add to the list until the sentinel value **ZZZ** is entered. Use an iterator to display all the `String` values, then continually ask the user for a `String` to eliminate until a sentinel value is entered. After each `String` is eliminated, display the new list. If the user attempts to continue to eliminate `String` values after the list is empty, display an appropriate message, and end the program.

An example of the program is shown below: 
```
Enter a word or ZZZ to quit >> Sulema
Enter another word or ZZZ to quit >> Roxanna
Enter another word or ZZZ to quit >> Miles
Enter another word or ZZZ to quit >> Alexander
Enter another word or ZZZ to quit >> Jimmy
Enter another word or ZZZ to quit >> ZZZ
Current words:
Sulema Roxanna Miles Alexander Jimmy 
Enter a word to eliminate or ZZZ to quit >> Miles
Current words:
Sulema Roxanna Alexander Jimmy 
Enter a word to eliminate or ZZZ to quit >> ZZZ
```

