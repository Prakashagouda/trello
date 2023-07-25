package test;

public class Fibonacci_without_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0,n1=1,n3,i,count=10;
		System.out.print(n+" "+n1);
		for(i=2;i<count;i++)
		{
			n3=n+n1;
			System.out.print(" "+n3);
			n=n1;
			n1=n3;
		}

	}

}
