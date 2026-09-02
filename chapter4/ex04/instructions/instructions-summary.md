## Part A
Create a class named `BloodData` that includes `String` fields that hold a blood type as `bloodType` (the four blood types are **O**, **A**, **B**, and **AB**) and an Rh factor as `rhFactor` (the factors are **+** and **–**). 

Create a default constructor that sets the fields to **O** and **+** and an overloaded constructor that requires values for both fields.

Include get and set methods for each field.

## Part B
Create an application named `TestBloodData` that declares two objects. Prompt the user for values for one, and use the default constructor values for the other. Display the details of both objects. Then change the values in the default object so it also uses the user’s values, and display the details for the object again to confirm the changes are made correctly.

An example of the program is shown below:

```
Enter blood type >> AB
Enter RH factor >> -
The blood is type O+
The blood is type AB-
The blood is type AB-
```

## Part C
Create a class named `Patient` that includes an ID number (`id`), age (`age`), and BloodData (`bloodData`).

Provide a default constructor that sets the ID number to **0**, the age to **0**, and the BloodData values to the default BloodData values (**O** and **+**). Create an overloaded constructor that provides values for each field.

Provide get methods for each field.

## Part D
Create an application called `TestPatient` that declares three `Patient` objects. Use all default values for one Patient object, prompt the user for values for the second Patient object, and for the third object, prompt the user for Patient data but use default values for that Patient’s BloodData.

An example of the program is shown below:
```
Enter ID number for patient >> 13
Enter age for patient 13 >> 23
Enter blood type for patient 13 >> AB
Enter RH factor for patient 13 >> -
Enter ID number for second patient >> 99
Enter age for patient 99 >> 12
Patient #0  age: 0
   The blood is type O+
Patient #13  age: 23
   The blood is type AB-
Patient #99  age: 12
   The blood is type O+
```

