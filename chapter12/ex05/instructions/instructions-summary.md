The examples below show two typical executions of a program that displays a triangle. Create the `TriangleRecursive` program by prompting the user for a number of lines to display. The first row of the output contains the number of spaces that equals the number of lines that will eventually display. Pass the final number of lines, the current line number, the spaces to display, and the number of letters to display to a recursive method. The base case occurs when the current line equals the total number of lines to display. If the total number of lines has not yet been displayed, reduce the number of spaces, increase the number of letters, increase the current line number, and call the method again.

Examples of the program are shown below: 
```
How many lines to display? >> 3
   T
  TTT
 TTTTT
```
```
How many lines to display? >> 7
       T
      TTT
     TTTTT
    TTTTTTT
   TTTTTTTTT
  TTTTTTTTTTT
 TTTTTTTTTTTTT
```

