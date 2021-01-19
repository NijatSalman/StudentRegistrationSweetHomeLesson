package main;

import java.util.Scanner;

import beans.Student;
import beans.Teacher;
import utility.RegistrationUtility;

public class Main {

   public static void main (String[] args){
		
		
	   Teacher teacher=RegistrationUtility.registerTeacher();	
	   RegistrationUtility.RegisterStudents(teacher); 
	   RegistrationUtility.printRegisteredTeacher(teacher);
	   
	   findRegisteredPerson(teacher);
   }
   
   	public static void findRegisteredPerson(Teacher teacher){
	   System.out.println("lets find");
   		Scanner scanner=new Scanner(System.in);
   		
   		Student[] student=teacher.getStudent();
   		String value=scanner.nextLine();
   		
   		for (int i = 0; i < student.length; i++) {
   			
   			if (student[i].getName().contains(value) || student[i].getSurName().contains(value)) {
   				System.out.println(student[i].toStirng());
   				System.out.println("test");
   			}
   			System.out.println("out of if");
		}
   		
   		
   		
   		
   }
   
   
}
