## Part A
Create a class named `BaseballGame` that contains data fields for two team names. Include a two-dimensional array called `scores` that can hold the scores for each of two teams in each inning of the game. The `BaseballGame` class includes a `final` `int` that represents the number of innings (`INNINGS`) in a baseball game—nine.

The constructor initializes the two-dimensional array to dummy values for each team for the number of innings. 

Create set methods for the team names and the individual inning scores. The `setScore()` method requires parameters for the team, inning, and score for that inning. 

Create get methods for the names and inning scores. Also include a method that determines the winner of the game after scores for the last inning have been entered. 

> For this exercise, assume that a game might end in a tie and there are never extra innings played. 

## Part B
Create two subclasses from `BaseballGame`: `HighSchoolBaseballGame` and `LittleLeagueBaseballGame`. High school baseball games have seven innings, and little league games have six innings; override the parent class `final int` to represent the correct number of innings for each subclass. The constructor for each class should set the scores to a default value for the appropriate number of innings.

## Part C
Write an application called `DemoBaseballGame` that allows the user to select a game type, **1** for a professional game, **2** for a high school game, and **3** for a little league game. Enter two team names and then, for each inning, allow the user to enter an inning score for each team and display the running scores so far. After all the innings are complete, display a message indicating which team won or if the result was a tie.

An example of the program is shown below:
```
Is this a (1) professional game, 
(2) High school game, or 
(3) Little league game ? >> 3
Enter first team name >> Tigers     
Enter second team name >> Bears

Inning 1
Score for Tigers >> 1
Score for Bears >> 0
Game between Tigers vs. Bears
Team 1: 1 
Team 2: 0 

...

Inning 6
Score for Tigers >> 1
Score for Bears >> 0
Game between Tigers vs. Bears
Team 1: 1 1 1 2 1 1 
Team 2: 0 1 0 2 1 0 
Tigers win!

```

> The example above does not include all of the program's input or output.


