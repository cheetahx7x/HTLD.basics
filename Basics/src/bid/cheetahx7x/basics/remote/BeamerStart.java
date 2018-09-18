package bid.cheetahx7x.basics.remote;

public class BeamerStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battery b1 = new Battery();
		Remote r1 = new Remote(b1);
		
		
		Battery b2 = new Battery();
		b2.setChargingStatus(0);
		Remote r2 = new Remote(b2);
		
		System.out.println(r1.hasPower());
		System.out.println(r2.hasPower());
		
		System.out.println(r1.isOn());
		System.out.println(r2.isOn());
		
		r2.isOn();		
		
		r1.turnOn();
		
		r1.isOn();
		
		System.out.println(r1.isOn());
	}

}
