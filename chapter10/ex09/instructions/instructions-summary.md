## Part A
Create an `Exception` class named `GradeException` that contains a `static` `public` array called `VALID_GRADES` which contains the valid grade letters: **A**, **B**, **C**, **D**, **F**, and **I** that you can use to determine whether a grade is valid.

## Part B
Write an application called `TestGrade` that displays a series of eight student ID numbers that you have stored in an array and asks the user to enter a letter grade for the student. Throw a `GradeException` if the user does not enter a valid letter grade as defined in the `GradeException` class. Catch the `GradeException`, and then display an appropriate message. In addition, store an **I** (for Incomplete) for any student for whom an `Exception` is caught. At the end of the application, display all the student IDs and grades.

An example of the program is shown below:
```
Enter letter grade for student id number: 1234 >> A
Enter letter grade for student id number: 1245 >> B
Enter letter grade for student id number: 1267 >> C
Enter letter grade for student id number: 1278 >> D
Enter letter grade for student id number: 2345 >> E
Invalid grade - Will be set to I
Enter letter grade for student id number: 1256 >> F
Enter letter grade for student id number: 3456 >> A
Enter letter grade for student id number: 3478 >> B

List of grades
ID #1234  Grade A
ID #1245  Grade B
ID #1267  Grade C
ID #1278  Grade D
ID #2345  Grade I
ID #1256  Grade F
ID #3456  Grade A
ID #3478  Grade B
```

