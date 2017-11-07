package models;
import java.util.Date;

public class Teacher extends Person{
	private String department;
	
	public void setDepartment(String dept){
		this.department = dept;
	}
	
	public String getDepartment(){
		return this.department;
	}
	
	public Teacher(String name, Date birthday, String department){
		super(name, birthday);
		this.department = department;	
	}
	
	public String toString(){
		return super.toString() + "\n Depto: "+ this.getDepartment();
	}
}