**[LECTURE MATERIAL](http://kitlei.web.elte.hu/segedanyagok/foliak/java/en-java-bsc/02object-orientation.pdf)**

## We will cover today

* Review Inheritance class once again
* Abstract classes

## Today's problem
Judit is a Hungarian lady who likes tro travel accros Europe, she uses three main ways of transportation, Bus, Train and Airplanes.

Your duty today is to create a comparator of transportation means for Judit,

Since all the public transportation are the same and Judit attended the Java Classes, she already created a class TravelTwoCities, so you don't need to bother with that, but she was strict, nobody should instantiate this class, as a good student that she is, she created a abstract class.

Let's start creating two classes who will inherit the abstract class created by Judit.
The **public class TrainTrip**, which has the name of the station and the maximum carriage class for that trip, AND, the **public class AirportTrip**, which has the distance to the airport and the name of the airport.

Judit has some money and loves to travel in the train first class sometimes,
Create also a method (in your main) to print out which trip Judit would prefer following the rules:

* If a trip by train is less than three hours difference from the trip by plane, she rather take the train;
* If the trip is more than three hours but the train has class A carriage, she'd rather take the train;
* If none of the above happens, she prefers to take the plane.


##Cool links
[Abstract methods and Classes (From Oracle)] (https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)
