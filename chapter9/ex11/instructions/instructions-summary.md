## Part A
Create a class named `Blanket` with fields for a Blanket’s size (`size`), color (`color`), material (`material`), and price (`price`). 

Include a constructor that sets default values for the fields as **twin**, **white**, **cotton**, and **$30.00**. 


Include set and get methods for each of the first three fields. The method that sets `size` adds $10 to the base `price` for a **double** blanket, $25 for a **queen** blanket, and $40 for a **king**.

> There should be four acceptable sizes: **twin**, **double**, **queen**, and **king**. 

The method that sets the `material` adds $20 to the `price` for **wool** and $45 to the `price` for **cashmere**. In other words, the price for a king-sized cashmere blanket is $115. Whenever the `size` or `material` is invalid, reset the blanket to the default values.

> There should be three acceptable materials: **cotton**, **wool**, and **cashmere**. 

Include a `toString()` method that returns a description of the blanket. 

## Part B
Create a child class named `ElectricBlanket` that extends `Blanket` and includes two additional fields: one for the number of heat settings (`settings`) and one for whether the `ElectricBlanket` has an automatic shutoff feature (`hasAutoShutoff`). Default values are **1** for `settings`  and `false` for `hasAutoShutoff`. 

Include get and set methods for the fields. Do not allow the number of settings to be fewer than one or more than five; if it is, use the default setting of **1**. Add a $5.75 premium to the `price` if the blanket has the automatic shutoff feature. 

Also include a `toString()` method that calls the parent class `toString()` method and combines the returned value with data about the new fields to return a complete description of features. 

## Part C
Create an application called `DemoBlankets` that creates a `Blanket` and displays the starting values. Then, continually prompt the user for a `Blanket` material. Display the values, prompt the user for a size, and display the values again. Continue to get new material and size values until the sentinel value **Q** is entered. Then do the same for an `ElectricBlanket`, including allowing the user to change the number of settings and whether the `ElectricBlanket` has the automatic shutoff feature.

An example of the program is shown below: 
```
...

Data for Electric Blanket:
twin size white cotton blanket.  Price $30.0. no automatic shutoff and 1 setting.
Enter material >> cashmere
twin size white cashmere blanket.  Price $75.0. no automatic shutoff and 1 setting.
Enter size >> king
king size white cashmere blanket.  Price $115.0. no automatic shutoff and 1 setting.
Enter color >> red 
king size red cashmere blanket.  Price $115.0. no automatic shutoff and 1 setting.
Enter number of settings >> 2
king size red cashmere blanket.  Price $115.0. no automatic shutoff and 2 settings.
Does blanket have auto shutoff? Y or N >> Y
king size red cashmere blanket.  Price $120.75. Blanket has automatic shutoff and 2 settings.
Enter material or Q to quit >> Q
```
> The example above does not include all of the program's input or output.

