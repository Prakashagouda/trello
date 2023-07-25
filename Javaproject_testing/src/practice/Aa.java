package practice;

public class Aa {
public static void main(String[] args) {
	int n=10;
	
	
	System.out.println(n+10);
	try
	{
	System.out.println(n/0);
	System.out.println("hello");
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	
	int [] b= {0,2,3,8,8,8}; 
	try
	{
		for(int i=0;i<b.length;i++)
		{System.out.println(b[i]);}
	}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
}
}
