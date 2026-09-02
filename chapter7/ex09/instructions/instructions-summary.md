## Part A
Write an application called `CategorizeStrings` that accepts up to 20 or fewer Strings. If the user enters the terminating value **ZZZ**, end the program. Store each `String` in one of two lists—one list for short `Strings` that are **10** characters or fewer and another list for long `Strings` that are **11** characters or more. 

After data entry is complete, prompt the user to enter which type of `String` list(**S** for short or **L** for long) to display, and then output the correct list. 

For this exercise, you can assume that if the user does not request the list of short `String` values, the user wants the list of long `String` values. If a requested list has no `String` values, output the message: **The list is empty**. Prompt the user continually until the sentinel value **ZZZ** is entered.

An example of the program is shown below:

```
Enter a string or ZZZ to quit >> tell
Enter a string or ZZZ to quit >> me
Enter a string or ZZZ to quit >> what
Enter a string or ZZZ to quit >> you
Enter a string or ZZZ to quit >> are
Enter a string or ZZZ to quit >> laughing
Enter a string or ZZZ to quit >> at
Enter a string or ZZZ to quit >> and
Enter a string or ZZZ to quit >> we
Enter a string or ZZZ to quit >> will
Enter a string or ZZZ to quit >> laugh
Enter a string or ZZZ to quit >> together
Enter a string or ZZZ to quit >> ZZZ
Do you want to see the list of short strings?
or the list of long strings?
   Please enter S or L or ZZZ to quit >> S

tell
me
what
you
are
laughing
at
and
we
will
laugh
together

Do you want to see the list of short strings?
or the list of long strings?
   Please enter S or L or ZZZ to quit >> L

The list is empty
Please enter S or L or ZZZ to quit >> ZZZ
```

## Part B
Copy the code from the *CategorizeStrings.java* file into the *CategorizeStrings2.java* file and modify the `CategorizeStrings` application to divide the entered `String` values into those that contain no spaces, one space, or more. After data entry is complete, continually prompt the user to enter the type of `String` to display (**O** for one word strings, **T** for two word strings, or **L** for longer strings.). If the user does not enter one of the three valid choices, display all of the `String` values. Rename the class to `CategorizeStrings2`.

An example of the program is shown below:
```
Enter a string or ZZZ to quit >> Hello
Enter a string or ZZZ to quit >> Hello, World!
Enter a string or ZZZ to quit >> Hello, World! I am a computer!
Enter a string or ZZZ to quit >> ZZZ

Do you want to see the list of
one-word strings, two-word strings,
or longer strings?
   Please enter O, T, or L, or ZZZ to quit >> L

List of longer strings:
Hello, World! I am a computer!

Do you want to see the list of
one-word strings, two-word strings,
or longer strings?
   Please enter O, T, or L, or ZZZ to quit >> ZZZ
```

