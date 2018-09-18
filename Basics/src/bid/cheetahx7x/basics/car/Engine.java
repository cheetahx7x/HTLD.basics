package bid.cheetahx7x.basics.car;

public class Engine {
	private String type;
	private int power;

	public Engine(String type, int power) {
		super();
		this.type = type;
		this.power = power;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

}
