## Part A
Create a `CourseException` class that extends the Java `Exception` class and whose constructor receives a single `String` argument that holds a message regarding college course’s department (for example, CIS), a course number (for example, 101), and a number of credits (for example, 3).

## Part B
Create a `Course` class with fields for the department (`department`), the course number (`courseNumber`), and the amount of credits (`credits`). The constructor requires values for each field.

Upon construction, throw a `CourseException` if the department does not consist of three letters, if the course number does not consist of three digits between 100 and 499 inclusive, or if the credits are less than 0.5 or more than 6. Each `CourseException` object should include an appropriate message that explains the reason the construction failed. 

Include a `toString()` method that returns a `String` that consists of an object’s department, course number, and credits. 

## Part C
Write an application called `ThrowCourseException` that establishes an array of six `Course` objects. Create an array of six `String` types to hold department names, six `int` types to hold course numbers, and six `double` types to hold credits. 

In a loop, prompt the user for values for each field. Accept any value for the department name. If the user does not enter an `int` for the course number, continually re-prompt until an `int` is entered. If the user does not enter a numeric value for the credits, re-prompt until a number is entered. 

In a new loop, try to construct six Course objects, each with values taken from the three arrays of field values. If a `CourseException` is thrown when constructing any of the objects, create the object using the default constructor. Then, in a third loop, display all the stored `Course` values using the `Course.toString()` method. 

An example of the program is shown below:
```
Enter department >> MATH
Enter course number >> 210
Enter credits >> 3
Enter department >> BIO
Enter course number >> 320
Enter credits >> 6
Enter department >> ENG
Enter course number >> 201
Enter credits >> 3
Enter department >> CS
Enter course number >> 340
Enter credits >> 4
Enter department >> CS
Enter course number >> 342
Enter credits >> 4
Enter department >> HIS
Enter course number >> 210 
Enter credits >> 3
Course 1  Error: Department code number must be three characters    MATH210  Credits 3.0
Course 4  Error: Department code number must be three characters    CS340  Credits 4.0
Course 5  Error: Department code number must be three characters    CS342  Credits 4.0

Course values
0  Credits 0.0
BIO320  Credits 6.0
ENG201  Credits 3.0
0  Credits 0.0
0  Credits 0.0
HIS210  Credits 3.0
```

