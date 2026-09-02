## Part A
Create a class named `Pizza` with a `String` array data field that can hold the names of up to 10 pizza toppings (`toppings`). Also include a field for the price (`price`). 

Include a blank, default constructor and an overloaded constructor that takes two parameters: the array of toppings and the number of toppings stored in the list. The constructor creates a `String` description (`description`) from the list of toppings, adding a comma between each topping. It also sets the price at $14 plus $2 for each topping. 

Include a `toString()` method to display the `Pizza` description and price.

## Part B
Create a subclass named `DeliveryPizza` that inherits from `Pizza` but adds a numeric delivery fee (`deliveryFee`) and a `String` delivery address (`address`).

Include a blank, default constructor and an overloaded constructor whose parameters include the array of toppings, the delivery address, and the number of toppings. The delivery fee is $3 if the pizza ordered costs more than $18; otherwise, the delivery fee is $5.

## Part C
Write an application called `DemoPizza` that prompts the user for topping values for a pizza. Allow the user to continually enter toppings until entering **Q** or reaching 10 toppings. Also ask the user whether the pizza is to be delivered. If the pizza is to be delivered, prompt the user for the delivery address and construct a `DeliveryPizza` object; otherwise, construct a `Pizza` object. Then, display all the values for the pizza.

An example of the program is shown below: 
```
Enter topping  >> Peppers
Enter topping or Q to quit >> Ham 
Enter topping or Q to quit >> Pineapple
Enter topping or Q to quit >> Q
Is this for delivery? Y or N >> Y
Enter delivery address >> 1 Main Street, Apt C         
Peppers, Ham, Pineapple pizza   Price: $20.0
    Deliver to: 1 Main Street, Apt C. Fee is $3.0
```

