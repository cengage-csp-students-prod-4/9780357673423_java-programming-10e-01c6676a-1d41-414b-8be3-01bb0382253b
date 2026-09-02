## Part A
Create an application called `StudentsStanding` that allows you to enter student data that consists of an ID number, first name, last name, and grade point average terminating the input stream with **ZZZ**. Depending on whether the student’s grade point average is at least 2.0, output each record either to a file of students in good standing (*StudentsGoodStanding.txt*) or those on academic probation (*StudentsAcademicProbation.txt*).

> The default file path for your project directory is `./`. 

An example of the program is shown below: 
```
Enter student ID >> 277
Enter firstName >> Alvin
Enter last name >> Boan
Enter grade point average >> 3.2
Enter next student ID  or ZZZ to quit >> 151   
Enter firstName >> Phuong
Enter last name >> Baharia
Enter grade point average >> 3.4
Enter next student ID  or ZZZ to quit >> 481
Enter firstName >> Johnna
Enter last name >> Chiroto
Enter grade point average >> 2.0
Enter next student ID  or ZZZ to quit >> 344
Enter firstName >> Horace
Enter last name >> Hobaugh
Enter grade point average >> 1.9
Enter next student ID  or ZZZ to quit >> ZZZ
```

## Part B
Create an application called `StudentsStanding2` that displays each record in the two files created in the `StudentsStanding` application in part A. Display a heading to introduce the list produced from each file. For each record, display the student ID number, first name, last name, grade point average, and the amount by which the grade point average exceeds or falls short of the 2.0 cutoff.

An example of the program is shown below: 
```
Probationary Standing

ID #344  Horace  Hobaugh  GPA: 1.9    -0.1 from 2.0 cutoff

Good Standing

ID #277  Alvin  Boan  GPA: 3.2    1.2 from 2.0 cutoff
ID #151  Phuong  Baharia  GPA: 3.4    1.4 from 2.0 cutoff
ID #481  Johnna  Chiroto  GPA: 2.0    0.0 from 2.0 cutoff
```

