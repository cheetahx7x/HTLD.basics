package bid.cheetahx7x.basics.car;

public class Producer {
	private String name;
	private String land;
	private int discount;

	public Producer(String name, String land, int discount) {
		super();
		this.name = name;
		this.land = land;
		this.discount = discount;
	}
	
	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}
	
}
