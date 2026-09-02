## Part A
Create a class named `Candle` for a candle-making business. Include data fields for color (`color`), height (`height`), and price (`price`). Create get methods for all three fields. Create set methods for `color` and `height`, but not for `price`. Instead, when `height` is set, determine the price as $2 per inch.

## Part B
Create a child class named `ScentedCandle` that contains an additional data field named `scent` and methods to get and set it. In the child class, override the parent’s method that sets the `height` to set the `price` of a `ScentedCandle` object at $3 per inch.

## Part C
Write an application called `DemoCandles` that instantiates a `Candle` object and a `ScentedCandle` object. Prompt the user for values for each object. For the `ScentedCandle`, offer the user at least four choices for the scent, such as gardenia, but you do not need to verify that the user enters one of the four choices. Display the details for each `Candle`. 

An example of the program is shown below: 
```
Enter a color for the candle >> purple
Enter a height in a whole number of inches >> 5
Enter a color for the scented candle >> orange
Enter a height in a whole number of inches >> 5
Enter a scent. Choose from the following:
gardenia, beach, pine, carnation     >> citrus
The 5 inch purple candle costs $10.0
The 5 inch citrus orange candle costs $15.0
```

