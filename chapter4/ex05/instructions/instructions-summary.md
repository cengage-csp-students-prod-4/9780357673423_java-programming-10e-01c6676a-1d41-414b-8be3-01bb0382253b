## Part A

Create a class to hold data about a high school sports team. The `Team` class holds data fields for high school name as `school` (such as Roosevelt High), sport as `sport` (such as Basketball), and team name as `mascot` (such as Dolphins). Also include a public final static `String` named `MOTTO` and initialize it to **Sportsmanship!**.

Include a default constructor that takes no parameters. Then, include an overloaded constructor that takes parameters for each data field.

Include get methods that return the values of the data fields.

## Part B

Write an application named `TestTeam` whose `main()`method declares three `Team` objects. For each `Team` object, call a method named `setTeamData()` that declares a temporary `Team` object, prompts the user for values for the fields, and returns the temporary object to one of the `Teams` in the `main()` method. Display all the data, including the motto, for each `Team` object.

An example of the program is shown below:

```
Enter school name >> Public School 118
Enter sport >> Curling
Enter mascot >> Tuna
Enter school name >> Randomtowne High School
Enter sport >> Tractor Racing
Enter mascot >> Scarecrows
Enter school name >> St. Petersburg
Enter sport >> Swimming
Enter mascot >> Lionfish
Public School 118 Curling team Tuna
   Our motto is Sportsmanship!
Randomtowne High School Tractor Racing team Scarecrows
   Our motto is Sportsmanship!
St. Petersburg Swimming team Lionfish
   Our motto is Sportsmanship!
```

## Part C

Create a class named `Game`. Include two `Team` fields that hold data about the teams participating in the game, call them `team1` and `team2`. Also include a `String` field for game time as `time` (for example, 7 PM).

Include a default constructor that takes no parameters and an overloaded constructor that takes parameters for two `Team` objects and a time.

Add a get method for each data field in the `Game` class.

## Part D

Write an application named `TestGame` to instantiate a `Game` object, prompt the user for the `Game` details, then pass the `Game` to a method that displays the details about the `Game`.

> Note that in this program, depending on what the user enters, the two teams are not necessarily playing the same sport! You will be able to fix this logical flaw after you learn about decision-making.

An example of the program is shown below:

```
The game between My High School Soccer Eagles
   and Your High School Soccer Falcons
   takes place at 6:45PM
```
