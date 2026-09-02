## Part A
Create a class named `JobApplicant` that holds data about a job applicant. Include a name as `name`, a phone number as `phone`, and four Boolean fields that represent whether the applicant is skilled in each of the following areas: word processing as `hasWordSkill`, spreadsheets as `hasSpreadsheetSkill`, databases as `hasDatabaseSkill`, and graphics as `hasGraphicsSkill`. 



Include a blank constructor that takes no arguments and an overloaded constructor that accepts values for each of the fields.

Also include a get method for each field. 

## Part B
Create an application called `TestJobApplicants` that instantiates three `JobApplicant` objects in the `main()` method. Pass each object, in turn, to a method called `getData()` that gets user data for each field: the user enters `Strings` for the name and phone number, and enters four integers that indicate whether the applicant possesses each of the four skills. Return a complete JobApplicant object to the `main()` method. 

After the objects are returned to the `main()` method, pass each to a boolean method called `isQualified()` that determines whether an applicant is qualified for an interview and returns `true` or `false`. A qualified applicant has at least three of the four skills. Then, in the `main()` method, display a message that includes the applicant’s name, phone number, and whether the applicant is qualified.

An example of the program is shown below:

```
Enter applicant's name >> John Smith
Enter applicant's phone number >> 456-7890
Is applicant skilled in word processing?
    Enter 1 for yes or 2 for no >> 1
Is applicant skilled in spreadsheet?
    Enter 1 for yes or 2 for no >> 1
Is applicant skilled in database?
    Enter 1 for yes or 2 for no >> 2
Is applicant skilled in graphics?
    Enter 1 for yes or 2 for no >> 2

...

John Smith is not qualified for an interview at this time  Phone: 456-7890
Jane Doe is not qualified for an interview at this time  Phone: 555-0155
Iris is qualified for an interview  Phone: 765-4321
```

