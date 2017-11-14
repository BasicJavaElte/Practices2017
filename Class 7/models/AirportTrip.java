package models;
public class AirportTrip extends TravelTwoCities{
  private String airportName;
  private double distanceToCityCenter;

  public AirportTrip(double speed, double distance, City cityOne, City citiTwo, String airportName, double distanceToCityCenter){
    super(speed, distance, cityOne, citiTwo);
    this.airportName = airportName;
    this.distanceToCityCenter = distanceToCityCenter;
  }

  public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public double getDistanceToCityCenter() {
		return distanceToCityCenter;
	}
	public void setDistanceToCityCenter(double distanceToCityCenter) {
		this.distanceToCityCenter = distanceToCityCenter;
	}




}
