package beans;

public class Teacher extends Human {
	
	private Student[] student;
	
	
	
	public Teacher(){
		
	}
	
	
	public Teacher(String name, String surName, int age,Student[] student){
		super(name,surName,age);
		this.student=student;
	}
	
	public Teacher(String name, String surName, int age){
		super(name,surName,age);
	}
	

	public Student[] getStudent() {
		return student;
	}


	public void setStudent(Student[] student) {
		this.student = student;
	}
	
	public String toString(){
		return " name: "+super.getName()+" SurName: "+super.getSurName()+" Age: "+super.getAge();
	}


}
