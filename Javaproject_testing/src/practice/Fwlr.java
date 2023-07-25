package practice;

public class Fwlr extends vehicles {
String id;
double sal;
public Fwlr(String name, int age, long contact, String id, double sal)
{
	super(name, age, contact);
	this.id = id;
	this.sal = sal;
}

public void  display2()
{
	display1();
	System.out.println(id);
	System.out.println(sal);
	
}	

}
