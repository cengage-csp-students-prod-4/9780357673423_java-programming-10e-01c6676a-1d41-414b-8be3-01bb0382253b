## Part A
Create an `abstract` class named `Book`. Include a `String` field for the Book’s title (`title`) and a `double` field for the book’s price (`price`). 

Within the class, include a constructor that requires the book title, and add two get methods—one that returns the title and one that returns the price. Include an abstract method named `setPrice()`. 

## Part B
Create two child classes of `Book`: `Fiction` and `NonFiction`. Each must include a `setPrice()` method that sets the `price` for all fiction books to $24.99 and for all nonfiction books to $37.99. 

Write a constructor for each subclass, and include a call to `setPrice()` within each.

## Part C
Write an application called `UseBook` demonstrating that you can create both a `Fiction` and `NonFiction` book, prompt the user for values, and display their fields. 

An example of the program is shown below:
```
Enter fiction book title >> Lord of the Rings
Enter nonfiction book title >> A Brief History of Time
Fiction Lord of the Rings costs $24.99
Non-Fiction A Brief History of Time costs $37.99
```

## Part D
Write an application named `BookArray` in which you create an array that holds 10 `Book` objects, some `Fiction` and some `NonFiction`. Using a `for` loop, prompt the user for a title and whether the book is fiction or nonfiction (**F** or **N**). Create the appropriate book type and store it in the array. If the user does not select F or N, re-prompt the user. In another for loop, display details about all 10 books.

An example of the program is shown below:
```
Enter title >> The Hobbit
Is this a (F)iction or
(N)onfiction title? >> F
Enter title >> Harry Potter
Is this a (F)iction or
(N)onfiction title? >> F
...
...                    
Enter title >> A Brief History of Time
Is this a (F)iction or
(N)onfiction title? >> N

Book: The Hobbit costs $24.99
Book: Harry Potter costs $24.99
...
...
Book: A Brief History of Time costs $37.99
```
> The example above does not include all of the program's input or output.

