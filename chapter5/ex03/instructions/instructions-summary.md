## Part A
Write an application called `ShadyRestRoom` for the Shady Rest Hotel; the program determines the price of a room. Ask the user to choose **1** for a **queen** bed, **2** for a **king**, or **3** for a **king and a pullout couch**. The output echoes the input and displays the price of the room: **$125** for **queen**, **$139** for **king**, and **$165** for a **suite with a king bed and a pullout couch**. If the user enters an invalid code, display an appropriate message and set the price to **0**. 

An example of the program is shown below: 
```
Menu

(1) Queen bed
(2) King bed
(3) Suite with a king bed and pull-out couch
Enter Selection (1, 2, or 3) >> 2
You selected King bed  $139
```

## Part B
Copy the contents of the `ShadyRestRoom` application into *ShadyRestRoom2.java* file and rename the class `ShadyRestRoom2`. Add a prompt to the `ShadyRestRoom` application to ask the user to specify a **(1) lake view** or a **(2) park view**, but ask that question only if the bed size entry is valid. Add **$15** to the price of any room with a **lake view**. If the view value is invalid, display an appropriate message and assume that the price is for a room with a **lake view**.

An example of the program is shown below: 

```
Menu

(1) Queen bed
(2) King bed
(3) Suite with a king bed and pull-out couch
Enter Selection (1, 2, or 3) >> 2
Please choose a view:
(1) a lake
(2) a park
Enter Selection (1 or 2) >> 1
You selected King bed with a lake view for $154
```

