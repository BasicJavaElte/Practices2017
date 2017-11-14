package models;
public class TrainTrip extends TravelTwoCities{
  private String stationName;
  private char maximunClass;

  public TrainTrip(double speed, double distance, City cityOne, City cityTwo, String stationName, char maximunClass){
    super(speed, distance, cityOne, cityTwo);
    this.stationName = stationName;
    this.maximunClass = maximunClass;
  }

  public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public char getMaximunClass() {
		return maximunClass;
	}
	public void setDistanceToCityCenter(char maximunClass) {
		this.maximunClass = maximunClass;
	}




}
