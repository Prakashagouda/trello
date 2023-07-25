package practice;

import java.util.Scanner;

public class Array {
	int Eid;
	String name;
	double Sal;
	
	public Array(int eid, String name, double sal) {
		super();
		this.Eid = eid;
		this.name = name;
		this.Sal = sal;	
	
	}
	
	private void display() {
	System.out.println(Eid);
	System.out.println(name);
	System.out.println(Sal);
	}

	public static void main(String[] args) {
		
		Array[]a=new Array[4];
		Array A=new Array(100,"sam",99.9d);
		Array B=new Array(200,"ram",89.9d);
		Array C=new Array(300,"tam",79.9d);
		Array D=new Array(400,"fam",69.9d);
		
		a[0]=A;
		a[1]=B;
		a[2]=C;
		a[3]=D;
		
		a[0].display();
		a[1].display();
		a[2].display();
		a[3].display();
		A.display();
		
}
	
}
