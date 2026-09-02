## Part A
Create an `abstract` `Division` class with fields for a company’s division name (`divisionTitle`) and account number (`acctNum`), and an abstract `display()` method. Use a constructor in the superclass that requires values for both fields. 

## Part B
Create two subclasses named `InternationalDivision` and `DomesticDivision`. 

The `InternationalDivision` subclass includes a field for the country in which the division is located (`country`) and a field for the language spoken (`language`); its constructor requires both.

The `DomesticDivision` subclass includes a field for the state in which the division is located (`state`); a value for this field is required by the constructor.

## Part C
Write an application named `UseDivision` that creates a `Division` reference. Ask the user whether a (**D**) for a `DomesticDivision` or (**I**) for an `InternationalDivision` object should be created. Prompt for appropriate values and assign a new subclass object to the `Division` reference. Then display the details of the created object.

An example of the program is shown below:
```
Is this for a (D)omestic or (I)nternational division? >> D
Enter division name >> Division 9
Enter acct number >> 32147889
Enter state >> Iowa
Domestic Division: Division Division 9 Acct# 32147889
Located in Iowa
```

