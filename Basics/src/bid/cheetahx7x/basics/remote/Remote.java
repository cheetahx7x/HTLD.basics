package bid.cheetahx7x.basics.remote;

public class Remote {
	private boolean isOn = false;
	private Battery battery;

	public Remote(Battery battery) {
		this.battery = battery;
	}

	public void turnOn() {
		this.isOn = true;
	}

	public void turnOff() {
		this.isOn = false;
	}
	
	public boolean isOn() {
		return isOn;
	}

	public boolean hasPower() {
		if (battery.getChargingStatus() > 0) {
			return true;
		} else {
			return false;
		}
	}

}
