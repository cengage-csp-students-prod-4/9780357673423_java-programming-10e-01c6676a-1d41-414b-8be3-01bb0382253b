# Part A
Create a `TeeShirt` class for Tamjeed’s Tee Shirt Company. Fields include an order number (`orderNumber`), size (`size`), color (`color`), and price (`price`). Create set methods for the order number, size, and color, and create get methods for all four fields. The `price` is determined by the `size`: 

* $22.99 for XXL or XXXL
* $19.99 for all other sizes


## Part B
Create a subclass named `CustomTee` that descends from `TeeShirt` and includes a field to hold the slogan requested for the shirt (`slogan`). Include get and set methods for this field.

## Part C
Write an application called `DemoTees` that prompts a user for values to create two objects of each class, and demonstrates that all the methods work correctly. 

An example of the program is shown below:

```
Enter order number >> 641
Enter color >> lime
Enter size >> MD
Enter order number >> 642
Enter color >> lime
Enter size >> XL
Enter order number >> 839
Enter color >> blue
Enter size >> XXL
Enter slogan for shirt >> H3LL0!
Enter order number >> 1014
Enter color >> pink
Enter size >> L
Enter slogan for shirt >> TTSC  
Order #641
     Description: MD lime
     Price: $19.99
Order #642
     Description: XL lime
     Price: $19.99
Order #839
     Description: XXL blue
     Price: $22.99
     Slogan: H3LL0!
Order #1014
     Description: L pink
     Price: $19.99
     Slogan: TTSC
```

