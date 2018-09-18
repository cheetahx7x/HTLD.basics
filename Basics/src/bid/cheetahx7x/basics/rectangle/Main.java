package bid.cheetahx7x.basics.rectangle;

public class Main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 2);
		Rectangle r2 = new Rectangle(7, 3);
		Rectangle r3 = r2;

		r1.SayHello();
		r2.SayHello();
		r3.SayHello();

		System.out.println("r1 hat ein Flächeninhalt von " + r1.getArea());
	}
}
