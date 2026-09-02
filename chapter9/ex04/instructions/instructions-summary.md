## Part A
Create a class named `Poem` that contains fields for the title (`title`) of the `Poem` and the number of lines (`lines`) in it. Include a blank default constructor and a constructor that requires values for both fields. Also include get methods to retrieve field values. 


## Part B
Create three subclasses: `Couplet`, `Limerick`, and `Haiku`. The constructor for each subclass requires only a `title`; the `lines` field is set using a constant value. 

* A couplet has two lines
* A limerick has five lines 
* A haiku has three lines.

> Each subclass should have its own file. 

## Part C
Create an application called `DemoPoems` that prompts the user for the type of `Poem` to be created using an integer **1** through **4**. 

1. Couplet
2. Limerick
3. Haiku
4. Plain poem

Continue to re-prompt the user until a valid number is entered. Then prompt the user for the `title`. If it is a plain `Poem`, also prompt the user for the number of `lines`. Instantiate the correct object, and display its details. 

An example of the program is shown below:

```
What type of poem do you want to create?
Enter 1 for couplet, 2 for limerick,
3 for haiku, or 4 for plain poem. >> 2
Enter title >> My Little Limerick
Poem: My Little Limerick   Lines: 5
```

