package vehicleStore;

public class TwoWheels extends Vehicle {
	protected boolean isOffRoad;
	protected int maxSpeed;
	
	public TwoWheels(String licenseNum, String company, int yaer, int price, int numOfWheels, 
			boolean isOffRoad, int maxSpeed) {
		super(licenseNum, company, yaer, price, numOfWheels);
		this.isOffRoad = isOffRoad;
		this.maxSpeed = maxSpeed;
	}
	public boolean isOffRoad() {
		return isOffRoad;
	}
	public void setOffRoad(boolean isOffRoad) {
		this.isOffRoad = isOffRoad;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return super.toString()+"TwoWheels [isOffRoad=" + isOffRoad + ", maxSpeed=" + maxSpeed + "]";
	}
}