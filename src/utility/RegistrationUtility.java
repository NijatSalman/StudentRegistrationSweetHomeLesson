package utility;

import java.util.Scanner;

import beans.Student;
import beans.Teacher;

public class RegistrationUtility {
	
	
	public static Teacher registerTeacher(){
		  
		Scanner scanner =new Scanner(System.in);
		    
			System.out.println("Type your Name");
			String name=scanner.nextLine();
			System.out.println("Type your surName");
			String surName=scanner.nextLine();
			System.out.println("Type your age");
			int age=scanner.nextInt();
			scanner.nextLine();
			
			Teacher teacher=new Teacher(name,surName,age);
			return teacher;
	}
	
	
	public static Student RegisterStudent(){
		Scanner scanner =new Scanner(System.in);

	    	
	    	System.out.println("What is student's name");
	    	String StudentName=scanner.nextLine();
	    	
	    	System.out.println("What is student's surname");
	    	String StudentSurname=scanner.nextLine();
	    	
	    	
	    	System.out.println("What is student's age");
	    	int StudentAge=scanner.nextInt();
	    	
	    	Student student=new Student(StudentName,StudentSurname,StudentAge);
	    	return student;	    
	   
	}
	
	
	public static void RegisterStudents(Teacher teacher){
		 System.out.println("How many students do you have?");
		    Scanner scanner =new Scanner(System.in);
		    int studentCount=scanner.nextInt();
		    scanner.nextLine();
		    Student[] students =new Student[studentCount];
		    
		    for(int i=0; i<studentCount; i++){	 	
		    	students[i]=RegistrationUtility.RegisterStudent();
		    }
		       
		   teacher.setStudent(students); 
	}
	
	
	public static void printRegisteredTeacher(Teacher teacher){
		  
		System.out.println("Information of Student");
		   System.out.println("Registration was successfully completed");
		   System.out.println(teacher.toString());
		   Student[] registeredStudents=teacher.getStudent();
		  
		   for (int i = 0; i < registeredStudents.length; i++) {		  
			System.out.println(registeredStudents[i].toStirng());
		}
	}
	
}
