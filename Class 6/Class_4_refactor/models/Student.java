package models;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Student extends Person{
	private Date enrolmentDate;
	SimpleDateFormat myFormat= new SimpleDateFormat("yyyy-MM-dd");
	
	public Student(String name, Date birthday, Date enrolment){
		super(name, birthday);
		this.enrolmentDate = enrolment;
	}
	
	public void setEnrolmentDate(Date enrolment){
		this.enrolmentDate = enrolment;
	}
	
	public Date getEnrolmentDate(){
		return this.enrolmentDate;
	}
	
	public String toString(){
		String date = myFormat.format(enrolmentDate);	
		
		return super.toString()+" Enrolment: "+date;
	}
	
	
}

