Write an application called `PigLatin` that accepts a word from a user and converts it to Pig Latin. 

If a word starts with a consonant, the Pig Latin version removes all consonants from the beginning of the word and places them at the end, followed by **ay**. For example, **cricket** becomes **icketcray**. 

If a word starts with a vowel, the Pig Latin version is the original word with **ay** added to the end. For example, **apple** becomes **appleay**. 

If **y** is the first letter in a word, it is treated as a consonant; otherwise, it is treated as a vowel. For example, **young** becomes **oungyay**, but **system** becomes **ystemsay**.

For this program, assume that the user will enter only a single word consisting of all lowercase letters. 

An example of the program is shown below:

```
Enter a word to be converted to Pig Latin >> tarantulas
Pig Latin version: arantulastay
```

