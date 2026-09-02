## Part A
The Talk-A-Lot Cell Phone Company provides phone services for its customers. Create an `abstract` class named `PhoneCall` that includes a `String` field for a phone number (`phoneNumber`) and a `double` field for the price (`price`) of the call. 

Include a constructor that requires a phone number parameter and that sets the `price` to **0.0**.

Include a set method for the `price`. Also include three abstract get methods—one that returns the `phoneNumber`, another that returns the `price` of the call, and a third that displays information about the call. 

## Part B
Create two child classes of `PhoneCall`: `IncomingPhoneCall` and `OutgoingPhoneCall`. The `IncomingPhoneCall` constructor passes its phone number parameter to its parent’s constructor and sets the `price` of the call to **2** cents. The method that displays the phone call information displays the phone number, the rate, and the price of the call (which is the same as the rate). 

The `OutgoingPhoneCall` class constructor includes an additional field that holds the time (`time`) of the call in minutes. The constructor requires both a phone number and the time. The `price` is **4** cents per minute, and the display method shows the details of the call, including the phone number, the rate per minute, the number of minutes, and the total price. 

## Part C
Write an application called `DemoPhoneCalls` in which you declare a `PhoneCall` reference. Then continually prompt the user for a type of call, (**I**)ncoming or (**O**)utgoing until the sentinel value **Q** is entered. Create either an `IncomingPhoneCall` object or an `OutgoingPhoneCall` object and assign it to the `PhoneCall` reference. Then display the data for the object.

An example of the program is shown below:

```
Is this call (I)ncoming or (O)utgoing?
Or enter Q to quit >> I
Enter the phone number >> 1-234-567-8901
Incoming phone call 1-234-567-8901 0.02 per call. Total is $0.02

Is this call (I)ncoming or (O)utgoing?
Or enter Q to quit >> O
Enter the phone number >> 1-098-765-4321
Enter minutes >> 23
Outgoing phone call 1-098-765-4321 0.04 per minute at 23 minutes. Total is $0.92

Is this call (I)ncoming or (O)utgoing?
Or enter Q to quit >> Q
```

