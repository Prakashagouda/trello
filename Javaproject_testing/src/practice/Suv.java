package practice;

public class Suv extends Fwlr  {
	String sub;

	public Suv(String name, int age, long contact, String id, double sal, String sub)
	{
		super(name,age, contact, id, sal);
		this.sub = sub;
	}
	
	public void display3()
	{
		display2();
		System.out.println(sub);
	}

	
}
