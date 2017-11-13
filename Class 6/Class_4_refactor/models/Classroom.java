package models;

import java.util.ArrayList;

public class Classroom{
	private ArrayList<Student> students;
	private Teacher teacher;

	//getters and setters
	public ArrayList<Student> getStudents(){
		return this.students;
	}

	public void setStudents(ArrayList<Student> students){
		this.students = students;
	}
	
	public void setTeacher(Teacher t){
		this.teacher = t;
	}
	
	public Teacher getTeacher(){
		return this.teacher;
	}

	public Classroom(){
		students = new ArrayList<Student>();
	}

	public void addStudent(Student s){
		students.add(s);
	}

	public int howManyStudents(){
		return students.size();
	}
	
	public void sort(){	
		for(int i=0; i<students.size()-1; i++){
			for(int j=i+1; j<students.size(); j++){
				Student s1 = students.get(i);
				Student s2 = students.get(j);
				if(s1.getName().compareTo(s2.getName())>0){
					Student aux = s1;
					students.set(j,aux);
					students.set(i, s2);
				}
				
			}
		}
	}
	
	public void printAll(){
		for(Student p: students){
			System.out.println(p);
		}
	}
	
	public boolean removeStudent(String name){
		for(int i=0; i<students.size(); i++){
			
			Student student=students.get(i);
			
			if(student.getName().equalsIgnoreCase(name)){
				students.remove(i);
				return true;
			}
		}

		return false; 	
	}
}