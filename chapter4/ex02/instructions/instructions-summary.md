## Part A
Implement the class named `Lease` with fields that hold an apartment tenant’s name (`name`), apartment number (`aptNumber`), monthly rent amount (`rent`), and term of the lease in months (`term`). 

Include a default constructor that initializes the name to **XXX**, the apartment number to **0**, the rent to **1000**, and the term to **12**.

Include methods to get and set each of the fields. Include a `nonstatic` method named `addPetFee()` that adds **$10** to the monthly rent value and calls a `static` method named `explainPetPolicy()` that explains the pet fee.

## Part B
Create a class named `TestLease` whose `main()` method declares four `Lease` objects named **lease1**, **lease2**, **lease3**, and **lease4**. 

Create a `getData()` method that prompts a user for values for each field for a `Lease`, and return a newly constructed `Lease` object to the `main()` method where it is assigned to one of `main()`’s first three Lease objects. _Do not prompt the user for values for the fourth `Lease` object, but let it hold the default values._


After the four `Lease` objects have been assigned values, pass the `lease1` object to a `showValues()` method that displays the data. 

The data should be displayed in the following format: 

```
Your lease results:
Name      : Jane Doe
Apartment : 21
Rent      : 1654.0
Term      : 13
```

Then call the `addPetFee()` method with the `lease1` object, and confirm that the fee explanation statement is displayed. Next, call the `showValues()` method for the `lease1` object again and confirm that the pet fee has been added to the rent. 

Finally, call the `showValues()` method with each of the other three objects. Confirm that two hold the values you supplied as input and one holds the constructor default values.
