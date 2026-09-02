## Part A
Radio station KJAVA wants a class to keep track of recordings it plays. Create a class named `Recording` that contains fields to hold methods for setting and getting a recording’s title (`song`), artist (`artist`), and playing time (`playTime`) in seconds.

## Part B
Write an application called `RecordingSort` that instantiates five Recording objects and prompts the user for values for the data fields. Then prompt the user to enter which field the Recordings should be sorted by—song title, artist, or playing time. Perform the requested sort procedure, and display the Recording objects.

> The request should be sorted in ascending order, A - Z, low to high. 

An example of the program is shown below: 
```
Enter a song for recording 1 >> Toccata and Fugue in D minor
Enter an artist for recording 1 >> J.S. Bach
Enter the time for the recording in seconds1 >> 535
Enter a song for recording 2 >> Bagatelle No. 25 in A minor
Enter an artist for recording 2 >> Ludwig Van Beethoven
Enter the time for the recording in seconds2 >> 177
Enter a song for recording 3 >> Piano Sonata No. 14 in C-sharp minor
Enter an artist for recording 3 >> Ludwig Van Beethoven
Enter the time for the recording in seconds3 >> 900
Enter a song for recording 4 >> Symphony No. 5 in C minor
Enter an artist for recording 4 >> Ludwig Van Beethoven
Enter the time for the recording in seconds4 >> 1980
Enter a song for recording 5 >> Ave Maria 
Enter an artist for recording 5 >> Charles Gounod
Enter the time for the recording in seconds5 >> 168
By which field do you want to sort? (S)ong, (A)rtist, or (T)ime  >> A
artist: Charles Gounod    song: Ave Maria    time: 168
artist: J.S. Bach    song: Toccata and Fugue in D minor    time: 535
artist: Ludwig Van Beethoven    song: Bagatelle No. 25 in A minor    time: 177
artist: Ludwig Van Beethoven    song: Piano Sonata No. 14 in C-sharp minor    time: 900
artist: Ludwig Van Beethoven    song: Symphony No. 5 in C minor    time: 1980
```

