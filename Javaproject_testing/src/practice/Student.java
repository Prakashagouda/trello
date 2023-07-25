package practice;

public class Student extends Empstud{

	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+ age;
	}
	
}
