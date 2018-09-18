package bid.cheetahx7x.basics.rectangle;

public class Rectangle {
	// Gedächtnisvariable, Instanz- oder Objektvariable
	private float a, b;

	public Rectangle(float a, float b) {
		this.a = a;
		this.b = b;
	}

	public void SayHello() {
		System.out.println("Ich bin " + this.a + " lang und " + this.b + " breit");
	}

	public double getArea() {
		return this.a * this.b;
	}

	public double getCricumference() {
		return 2 * a + 2 * b;
	}

	public void setLength(float a) {
		this.a = a;
	}

	public void setWidth(float b) {
		this.b = b;
	}

	public float getLength() {
		return this.a;
	}

	public float getWidth() {
		return this.b;
	}

}
