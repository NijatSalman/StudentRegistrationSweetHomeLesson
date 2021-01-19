package beans;

public class Student extends Human{

	
	
	public Student (){
		
	}
	
	
	public Student(String name, String surName, int age) {
		super(name,surName,age);
	}


	@Override
	public String toStirng() {
		return "Name: "+ super.getName()+ "Surname: "+super.getSurName()+"Age: "+super.getAge();
	}
	
}
