## Part A
Create an `abstract` class called `GeometricFigure`. Each figure includes a height (`height`), a width (`width`), and a `String` figure (`figure`) type. Include an abstract method called `figureArea` to determine the area of the figure.

## Part B
Create two subclasses of `GeometricFigure` called `Square` and `Triangle`. Include a field in each to hold the area (`area`). Provide methods as necessary.

## Part C
Create an application called `UseGeometric` that prompts the user for values for at least five objects that can each be a `Square` (**S**) or a `Triangle` (**T**), and store them in an array of `GeometricFigures`. Then display the figure type, height, width, and area of each `GeometricFigure`.

An example of the program is shown below:
```
Is this a (S)quare or a (T)riangle? >> S
Enter height >> 10
Is this a (S)quare or a (T)riangle? >> T
Enter height >> 5
Enter width >> 5
Is this a (S)quare or a (T)riangle? >> T
Enter height >> 5
Enter width >> 8
Is this a (S)quare or a (T)riangle? >> S
Enter height >> 12
Is this a (S)quare or a (T)riangle? >> S
Enter height >> 2
The Square with height = 10 and with width = 10 has an area of 100.0
The Triangle with height = 5 and with width = 5 has an area of 12.5
The Triangle with height = 5 and with width = 8 has an area of 20.0
The Square with height = 12 and with width = 12 has an area of 144.0
The Square with height = 2 and with width = 2 has an area of 4.0
```

## Part D
Create an `interface` named `SidedObject` that contains a method called `displaySides()`; this method displays a message that explains the number of sides an object possesses.

## Part E
Copy the contents of the *GeometricFigure.java* file into the *GeometricFigure2.java* file and modify the `GeometricFigure` class to implement `SidedObject`. Make the `displaySides()` method abstract and rename the class `GeometricFigure2`. 

> The constructor for the `GeometricFigure2` class needs to have the following definition for testing:
```java
GeometricFigure2(int, int, String) {
    ...
}
```

## Part F
Copy the contents of the *Square.java* and *Triangle.java* files into the *Square2.java* and *Triangle2.java* files and modify the `Square` and `Triangle` classes to include implementations of the `displaySides()` method. Rename the classes as `Square2` and `Triangle2`.

## Part G
Copy the contents of the *UseGeometric.java* file into the *UseGeometric2.java* file and modify the `UseGeometric` class to use the new class and interface when creating the array of five objects. Rename the class as `UseGeometric2`. 

An example of the program is shown below: 
```
Is this a (S)quare or a (T)riangle? >> S
Enter height >> 10
Is this a (S)quare or a (T)riangle? >> T
Enter height >> 5
Enter width >> 5
Is this a (S)quare or a (T)riangle? >> T
Enter height >> 5
Enter width >> 8
Is this a (S)quare or a (T)riangle? >> S
Enter height >> 12
Is this a (S)quare or a (T)riangle? >> S
Enter height >> 2
The Square with height = 10 and with width = 10 has an area of 100.0
The Triangle with height = 5 and with width = 5 has an area of 12.5
The Triangle with height = 5 and with width = 8 has an area of 20.0
The Square with height = 12 and with width = 12 has an area of 144.0
The Square with height = 2 and with width = 2 has an area of 4.0
```

