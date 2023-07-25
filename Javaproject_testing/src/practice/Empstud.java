package practice;

public class Empstud {
public static void main(String[] args) {
	
	Student a=new Student("man", 9);
	Student b=new Student("fan", 9);
	Employe c= new Employe("janna", 999);
	Employe d= new Employe("ganna", 989);
	
  
	Object []ob=new Object[5];

	ob[0]=a;
	ob[1]=b;
	ob[2]=c;
	ob[3]=d;
	ob[4]=null;
	for (int i=0;i<4;i++)
	{
		System.out.println(ob[i]);
	}
}
}
