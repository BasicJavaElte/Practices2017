// Date has our Date class, no doubts we need that
import java.util.Date;

// java.text has our SimpleDateFormat class,
// for the exaple we will import everything so you know you can do it
import java.text.*;

public class DateItinerary{
  private Date current;
	private Date goal;

  // Let's create this as a private object, so that we can access along the class
	private SimpleDateFormat myFormat= new SimpleDateFormat("yyyyMMdd");


	public boolean isInTheFuture(){
    // If my goal is before the current date, we are traveling to the future
		return current.before(goal);
	}

	public boolean isInThePast(){
    // If my goal is after the current date, we are traveling to the past
		return current.after(goal);
	}

	public DateItinerary(String current, String goal){
    // Trying to parse the given dates, otherwise we print the exception
		try{
			this.current = myFormat.parse(current);
			this.goal = myFormat.parse(goal);
		}catch(ParseException pe){
			System.out.println(pe.toString());
		}catch(Exception e){
      // We will not get here because there is only ParseException in this case
      // This is just for you to see the default Exception and that we can have more than one
      System.out.println(e.toString());
    }
	}

  // Getters and Setters the way we learned
	public void setCurrent(Date current){
		this.current = current;
	}
	public void setGoal(Date goal){
		this.goal = goal;
	}

	public Date getCurrent(){
		return this.current;
	}
	public Date getGoal(){
		return this.goal;
	}


  @Override
	public String toString(){

		if (isInTheFuture()){
      return "Traveling from "+myFormat.format(this.current)
				+" to "+myFormat.format(this.goal)
				+" we are traveling to the future";
		}else

		if(isInThePast()){
			return "Traveling from "+myFormat.format(this.current)
				+" to "+myFormat.format(this.goal)
				+" we are traveling to the past";

    }else
      // If it is not in the past either in the future? It is probably today =)
			return "No trip on that";
	}
}
