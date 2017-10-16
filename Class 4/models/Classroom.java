package models;

import java.util.ArrayList;

public class Classroom{
	private ArrayList<Person> students;

	//getters and setters
	public ArrayList<Person> getStudents(){
		return this.students;
	}

	public void setStudents(ArrayList<Person> students){
		this.students = students;
	}

	public Classroom(){
		students = new ArrayList<Person>();
	}

	public void addStudent(Person p){
		students.add(p);
	}

	public int howManyStudents(){
		return students.size();
	}
	
	public boolean removeStudent(String name){
		for(int i=0; i<students.size(); i++){
			
			Person student=students.get(i);
			
			if(student.getName().equalsIgnoreCase(name)){
				students.remove(i);
				return true;
			}
		}

		return false; 	
	}
}
