package practice;

public class Bulb implements Eswitch {

	@Override
	public void Switchon() {
		
		System.out.println("bulb on");
	}

	@Override
	public void Switchff() {
		System.out.println("bulb off");	
		
	}

}
