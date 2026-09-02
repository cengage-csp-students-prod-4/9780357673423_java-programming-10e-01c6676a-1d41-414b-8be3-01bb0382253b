## Part A
Create a `CollegeCourse` class. The class contains fields for the course ID as `courseID` (for example, CIS 210), credit hours as `credits` (for example, 3), and a letter grade as `grade` (for example, A). Include get and set methods for each field.


## Part B
Create a `Student` class containing an ID number (`stuID`) and an array of five `CollegeCourse` objects (`courses`). 

Create a get and set method for the Student ID number. Also create a get method that returns one of the Student’s CollegeCourses; the method takes an `int` argument and returns the `CollegeCourse` in that position (0 through 4). 

Next, create a set method that sets the value of one of the Student’s CollegeCourse objects; the method takes two arguments—a `CollegeCourse` and an `int` representing the CollegeCourse’s position (0 through 4).


## Part C
Write an application called `InputGrades` that prompts a professor to enter grades for five different courses each for 10 students. Prompt the professor to enter data for one student at a time, including student ID and course data for five courses. Use prompts containing the number of the student whose data is being entered and the course number—for example, **Enter ID for student #1, and Enter course ID #5**. Verify that the professor enters only A, B, C, D, or F for the grade value for each course.

An example of the program is shown below: 

```
For student #1, enter the student ID >> 1
For student #1, enter course #1 >> CS 201
For student #1, enter credits for course  #1 >> 3
For student #1, enter grade for course  #1 >> B
For student #1, enter course #2 >> CS 141
For student #1, enter credits for course  #2 >> 3
For student #1, enter grade for course  #2 >> B
...
```

> The example above does not include all of the program's input or output.


