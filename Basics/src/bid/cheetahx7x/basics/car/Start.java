package bid.cheetahx7x.basics.car;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine e1 = new Engine("Diesel", 5000);
		Engine e2 = new Engine("Benzin", 5000);

		Producer p1 = new Producer("WMB", "Austria", 20);
		Producer p2 = new Producer("BetaRomeo", "Italien", 10);

		Car c1 = new Car(e1, p1);
		Car c2 = new Car(e2, p2);

		System.out.println(c1.getUsage(100));
		System.out.println(c1.getUsage(51000));
		System.out.println(c1.getPrice());

		System.out.println(c2.getUsage(200));
		System.out.println(c2.getUsage(70000));
		System.out.println(c2.getPrice());

		c2.setBaseprice(40000);
		c2.setBaseusage(3);

		System.out.println(c2.getUsage(100));
		System.out.println(c2.getUsage(51000));
		System.out.println(c2.getPrice());

	}

}
