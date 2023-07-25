package practice;

public class IBexcte {
	public static void main(String[] args) {
		//Bulb a=new Bulb();
		//Eswitch e=(Eswitch)a;
		Eswitch e=new Bulb(); //upcasting
		e.Switchff();
		
		Eswitch f=new Ironbox();;
				f.Switchon();
	}

}
