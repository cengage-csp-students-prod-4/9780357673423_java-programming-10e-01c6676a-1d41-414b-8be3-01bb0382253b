Write a program called `DisplaySortedLists` that creates two `ArrayList` objects—one to hold `String` values and one to hold `Integer` values. Prompt the user for a word, and while the user does not enter the sentinel value **quit**, continue to add each entered word to the `ArrayList`, sort the list, pass the list to a `display()` method, and prompt for another word. After the user enters the sentinel value, prompt the user for an integer. While the user does not enter the sentinel value, continue to add each entered `Integer` to the `ArrayList`, sort the list, pass the list to the same `display()` method, and then prompt the user for another `Integer`. 

The `display()` should display the list after each new addition. 

An example of the program is shown below: 
```
Enter a word or quit to quit >> Tu
The size of the list is 1
Tu
Enter a word or quit to quit >> Jason
The size of the list is 2
Jason
Tu
Enter a word or quit to quit >> quit
Enter a number or quit to quit >> 261
The size of the list is 1
261
Enter a number or quit to quit >> 511
The size of the list is 2
261
511
Enter a number or quit to quit >> quit
```

