import models.City;
import models.AirportTrip;
import models.TrainTrip;
public class MyTripPlanner{

  public static void printIfWorthsTrain(AirportTrip airport, TrainTrip train){


  }


  public static void main (String args[]){
    City budapest = new City("budapest");
    City debrecen = new City("debrecen");
    City barcelona = new City("barcelona");

    TrainTrip trBPDB = new TrainTrip(50.5, 100, budapest, debrecen, "Keleti", 'A');
    AirportTrip aiBPDB = new AirportTrip(200, 100, budapest, debrecen, "Liszt Ferenc", 20);

    printIfWorthsTrain(aiBPDB,trBPDB);

  }
}
