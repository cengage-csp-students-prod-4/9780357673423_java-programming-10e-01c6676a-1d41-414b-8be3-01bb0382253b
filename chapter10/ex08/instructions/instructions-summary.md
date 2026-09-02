## Part A
Create a `ScoreException` class that extends `Exception` and whose constructor accepts a `String` parameter and passes it to the `Exception` class constructor.

## Part B
Write an application called `TestScore` in which you store at least five student ID numbers in an array. 

One at a time, display the ID number and prompt the user to enter a test score for the student. Catch any `Exception` thrown if the user does not enter an integer for the score, display an error message, and set the score to **0**. 

Throw a `ScoreException` if the user enters a score greater than **100**. Catch the `ScoreException`, display an appropriate message, and then store a **0** for the student’s score. 

At the end of the application, display all the student IDs and scores. 

An example of the program is shown below:
```
Enter score for student id number: 1234 >> 87
Enter score for student id number: 2345 >> Hello
Score must be an integer - will be 0
Enter score for student id number: 3456 >> 88
Enter score for student id number: 4567 >> 75
Enter score for student id number: 5678 >> 75
ID #1234  Score 87
ID #2345  Score 0
ID #3456  Score 88
ID #4567  Score 75
ID #5678  Score 75
```

