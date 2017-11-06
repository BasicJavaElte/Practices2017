package models;
import java.util.Date;

public class Teacher extends Person{
	private String subjects;
	
	public Teacher(String teacherName, Date teacherDay, String subjects){
		super(teacherName, teacherDay);
		this.subjects = subjects;
	}
	public void setSubjects(String subjects){
		this.subjects = subjects;
	}
	
	public String getSubjects(){
		return this.subjects;
	}
	
	
	public String toString(){
		return super.toString() +
			" Subjects" + this.subjects;
		
	}
	
}