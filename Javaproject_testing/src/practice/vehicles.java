package practice;

public class vehicles {
	String name;
	int age;
	long contact;

	public vehicles(String name, int age, long contact)
	{
		this.name = name;
		this.age = age;
		this.contact = contact;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+age+" "+contact;	
	}



	public boolean equals(vehicles ob) {
		if (this.name==ob.name)
			{return true;}
		else
			{return false;}
	
	}
	/*
	public boolean equals1(vehicles ob) {
		if (this.age==ob.age)
			{return true;}
		else
			{return false;}
	
	}
	
	public boolean equals2(vehicles ob) {
		if (this.contact==ob.contact)
			{return true;}
		else
			{return false;}
	
	}
*/

	public static void main(String[]args)
	{
		vehicles a=new vehicles("add",99,9956l);
		vehicles b=new vehicles("bdd",89,9957l);
		vehicles c=new vehicles("bdd",8,9957l);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
		
	}
	
	
	
}
