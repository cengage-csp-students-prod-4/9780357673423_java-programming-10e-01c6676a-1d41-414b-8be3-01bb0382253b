## Part A
Create a `Purchase` class similar to the one described in a “You Do It” section earlier in this chapter. The `Purchase` class contains a `String` category for the purchase (such as groceries) and a numeric price. Include a `compareTo()` method that will allow an application to sort `Purchase` objects by category.


## Part B
Write an application called `PurchasesArrayListWithTotals` that continually prompts the user for `Purchase` categories and prices until the user enters the sentinel value **ZZZ**. Store the `Purchase` objects in an `ArrayList` and then sort them. Display the `Purchase` object details with a total following each category. 

The figure below shows a typical execution. (As you have learned, working with floating-point data can be imprecise. If you do not like the way your numeric output is formatted, you can improve it by using the techniques presented in Appendix C.). 

An example of the program is shown below: 
```
Enter category for purchase or ZZZ to quit >> housing
Enter amount spent >> 875.55
Enter category for purchase or ZZZ to quit >> gas
Enter amount spent >> 32.85
Enter category for purchase or ZZZ to quit >> groceries
Enter amount spent >> 23.75
Enter category for purchase or ZZZ to quit >> gas
Enter amount spent >> 15.92
Enter category for purchase or ZZZ to quit >> groceries
Enter amount spent >> 44.71
Enter category for purchase or ZZZ to quit >> entertainment
Enter amount spent >> 35.55
Enter category for purchase or ZZZ to quit >> gas
Enter amount spent >> 18.93
Enter category for purchase or ZZZ to quit >> ZZZ

entertainment 35.55
    Total for entertainment: 35.55
gas 32.85
gas 15.92
gas 18.93
    Total for gas: 67.7
groceries 23.75
groceries 44.71
    Total for groceries: 68.46
housing 875.55
    Total for housing: 875.55
```


