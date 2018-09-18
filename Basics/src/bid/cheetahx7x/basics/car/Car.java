package bid.cheetahx7x.basics.car;

public class Car {
	private String color = "red";
	private int maxspeed = 300;
	private int baseprice = 50000;
	private float baseusage = 2;
	private Engine Engine;
	private Producer Producer;

	public Car(Engine engine, Producer producer) {
		super();
		Engine = engine;
		Producer = producer;
	}

	public int getPrice() {
		return baseprice - baseprice * Producer.getDiscount() / 100;
	}

	public String getType() {
		return Engine.getType();
	}

	public double getUsage(int distance) {
		if(distance < 50000) {
			return baseusage;
		}
		else {
			return baseusage + baseusage * 0.098;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}

	public int getBaseprice() {
		return baseprice;
	}

	public void setBaseprice(int baseprice) {
		this.baseprice = baseprice;
	}

	public float getBaseusage() {
		return baseusage;
	}

	public void setBaseusage(float baseusage) {
		this.baseusage = baseusage;
	}
}
