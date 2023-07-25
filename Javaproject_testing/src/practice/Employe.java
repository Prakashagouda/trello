package practice;

public class Employe extends Empstud{
String post;
int sal;
public Employe(String post, int sal) {
	super();
	this.post = post;
	this.sal = sal;
	 
	}
@Override
public String toString() {
	
	return post+" "+ sal;
}

}
