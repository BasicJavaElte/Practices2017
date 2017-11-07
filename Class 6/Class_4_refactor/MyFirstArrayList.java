import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import models.Person;
import models.Teacher;
import models.Classroom;


public class MyFirstArrayList{
	static Scanner scanner = new Scanner(System.in);
	static SimpleDateFormat myFormat= new SimpleDateFormat("yyyyMMdd");
	static Classroom classroom = new Classroom();
	
	public static void main(String args[]){		
		
		String userCommand;							
		do{
			System.out.println("Say 'exit' 'add', 'remove' , 'addTeacher', or 'list' ");
			userCommand = scanner.next();

			switch(userCommand){
				case "add":
					addStudent();
					break;
					
				case "addTeacher":
					addTeacher();
					break;
					
				case "remove":
					System.out.println("Who you want to remove");
					String studentName = scanner.next();
					if(classroom.removeStudent(studentName)){
						System.out.println("Adios");
						System.out.println("My classrooom has "+classroom.howManyStudents());
					}else{
						System.out.println("Student not removed");
					}
					break;
				case "list":
					classroom.sort();
					classroom.printAll();
					break;

			}
			
		}while(!userCommand.equals("exit"));
	}
		
	public static void addStudent(){
	  System.out.println("Say the name of the Person");
	  String name = scanner.next();


	  System.out.println("Say the birthday of the Person(YYYYMMDD)");
	  Date day = new Date();

	  boolean validDate = false;
	  while(!validDate){
			try{
			  day = myFormat.parse(scanner.next());
			  validDate = true;
			}catch(ParseException e){
			  System.out.println("Invalid date, type it again");
			  validDate = false;
			}
	  }

	  Person p = new Person(name, day);		
	  classroom.addStudent(p);
	  System.out.println("My classrooom has "+classroom.howManyStudents());
	}
	public static void addTeacher(){
		
		System.out.println("Say the name of the Person");
		String teacherName = scanner.next();
					
		System.out.println("Say the name of the department");
		String department = scanner.next();

		System.out.println("Say the birthday of the Person(YYYYMMDD)");
		Date tDay = new Date();

		boolean tValidDate = false;
		while(!tValidDate){			
			try{
				tDay = myFormat.parse(scanner.next());
				tValidDate = true;
			}catch(ParseException e){
				System.out.println("Invalid date, type it again");
				tValidDate = false;
			}
		}

		Teacher t = new Teacher(teacherName, tDay, department);
		classroom.setTeacher(t);
		System.out.println(t.toString());
	}

}