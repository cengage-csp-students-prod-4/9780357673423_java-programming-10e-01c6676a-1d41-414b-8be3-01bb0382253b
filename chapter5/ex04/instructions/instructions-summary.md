Write a program called `CellPhoneService` for Horizon Phones, a provider of cellular phone service.

Prompt a user for maximum monthly values for talk minutes needed, text messages needed, and gigabytes of data needed, and then display a recommendation for the best plan for the customer’s needs. 

* A customer who needs fewer than 500 minutes of talk and no text or data should buy Plan A at **$49** per month.
* A customer who needs fewer than 500 minutes of talk and any text messages should buy Plan B at **$55** per month. 
* A customer who needs 500 or more minutes of talk and no data should buy either Plan C for up to but not including 100 text messages at **$61** per month or Plan D for 100 text messages or more at **$70** per month. 
* A customer who needs any data should buy Plan E for up to but not including 3 gigabytes at **$79** per month or Plan F for 3 gigabytes or more at **$87** per month.

An example of the program is shown below: 
```
Enter talk minutes needed >> 525
Enter text messages needed >> 1000
Enter gigabytes of data needed >> 3
Plan F  $87 per month
```

