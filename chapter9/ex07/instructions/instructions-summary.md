## Part A
Create a class named `Rock` that acts as a superclass for rock samples collected and catalogued by a natural history museum. The `Rock` class contains fields for a number of samples (`sampleNumber`), a description of the type of rock (`description`), and the weight of the rock in grams (`weight`). 

Include a blank, default constructor and an overloaded constructor that accepts parameters for the sample number and weight. The overloaded constructor sets the description value to **Unclassified**. 

Include get methods for each field.


## Part B
Create three child classes named `IgneousRock`, `SedimentaryRock`, and `MetamorphicRock`. Include a blank default constructor for each class. Then create overloaded constructors for each class that require parameters for the `sampleNumber` and `weight`. Search the Internet for a brief description of each rock type and assign it to the description field.

## Part C
Create an application called `DemoRocks` that prompts the user for the type of rock collected. 

If the user does not enter  **U**, **I**, **S**, or **M** for the rock type, then create a `Rock` with sample number 0 and weight 0. If the user selects a valid rock type, then prompt the user for the sample number and the weight. 

Create the appropriate type of `Rock`, then pass it to a method that accepts a `Rock` parameter and displays all the details for the `Rock`.

An example of the program is shown below: 
```
Enter type of rock:
U for Unclassified, I for Igneous
S for Sedimentary, or M for Metamorphic >> I
Enter sample number >> 223
Enter weight in grams >> 6.8

Sample # 223 weighs 6.8 grams
Description:   Igneous rocks are crystalline solids 
   which form directly from the cooling of magma.
```

