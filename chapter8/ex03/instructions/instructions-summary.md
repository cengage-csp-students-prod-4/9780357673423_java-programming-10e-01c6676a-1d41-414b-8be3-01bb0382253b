## Part A
Write an application for Chapa’s Car Care Shop called `CarCareChoice` that shows a user a list of available services: 

* oil change
* tire rotation
* battery check
* brake inspection

Allow the user to enter a string that corresponds to one of the options, and display the option and its price as $25, $22, $15, or $5, accordingly. Display an error message if the user enters an invalid item.

An example of the program is shown below:

```
oil change
tire rotation
battery check
brake inspection
Enter selection >> tire rotation
tire rotation price is $22
```

## Part B
It might not be reasonable to expect users to type long entries such as "oil change" accurately. Copy the code from the *CarCareChoice.java* file into the *CarCareChoice2.java* file and modify the `CarCareChoice` class so that as long as the user enters the first three characters of a service, the choice is considered valid. Rename the class `CarCareChoice2`. 

An example of the program is shown below: 
```
oil change
tire rotation
battery check
brake inspection
Enter selection >> oil chnge
oil change price is $25
```

