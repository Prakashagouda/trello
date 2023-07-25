package practice;

public class Swipe {
	public static void aswiped(Card ob)
	{
		ob.payment();
		if(ob instanceof Debit)
		{
			Debit d=(Debit)ob;
			d.ddisplay();
		}
		else
		{
			Credit c=(Credit)ob;
			c.cdisplay();
		}
		
		
	}
	
	
	public static void main(String[]args)
	{
		Debit a=new Debit();
		Credit b=new Credit();
		aswiped(a);
		aswiped(b);
	}

}
