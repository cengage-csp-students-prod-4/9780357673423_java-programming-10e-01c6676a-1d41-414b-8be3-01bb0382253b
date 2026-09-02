## Part A
Create a class named `Apartment` that holds an apartment number as `aptNumber`, number of bedrooms as `bedrooms`, number of baths as `baths`, and rent amount as `rent`. 

Create a default constructor that accepts no arguments and an overloaded constructor that accepts values for each data field.

Also create a get method for each field. 

## Part B
Write an application called `TestApartments` that creates at least five `Apartment` objects. Then prompt a user to enter a minimum number of bedrooms required, a minimum number of baths required, and a maximum rent the user is willing to pay. Display data for all the `Apartment` objects that meet the user’s criteria or an appropriate message if no such apartments are available.

An example of the program is shown below: 
```
Enter minimum number of bedrooms needed >> 2
Enter minimum number of bathrooms needed >> 1.5
Enter maximum rent willing to pay >> 1200

Apartments meeting criteria of
at least 2 bedrooms, at least 1.5 baths, and  no more than $1200.0 rent:
   Apt #102    2 bedrooms, and 1.5 baths. Rent $775.0
   Apt #103    3 bedrooms, and 2.0 baths. Rent $870.0
   Apt #104    3 bedrooms, and 2.5 baths. Rent $960.0
   Apt #105    3 bedrooms, and 3.0 baths. Rent $1100.0
```

