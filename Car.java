package vehicleStore;

public class Car extends Vehicle {
	protected  int numOfSeats;
	protected  int fuelPerLiter;
	protected  boolean isElectric;
	protected int engineCapacity;
	
	public Car(String licenseNum, String company, int yaer, int price, int numOfWheels,
			int numOfSeats, int fuelPerLiter, boolean isElectric, int engineCapacity) {
		super(licenseNum, company, yaer, price, numOfWheels);
		this.numOfSeats = numOfSeats;
		this.fuelPerLiter = fuelPerLiter;
		this.isElectric = isElectric;
		this.engineCapacity = engineCapacity;
	}
	public int getNumOfSeats() {
		return numOfSeats;
	}
	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
	public int getFuelPerLiter() {
		return fuelPerLiter;
	}
	public void setFuelPerLiter(int fuelPerLiter) {
		this.fuelPerLiter = fuelPerLiter;
	}
	public boolean isElectric() {
		return isElectric;
	}
	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public void printLicenseNum() {
		System.out.println("This is Car:");
		super.printLicenseNum();
	}
	@Override
	public String toString() {
		return super.toString()+"Car [numOfSeats=" + numOfSeats + ", fuelPerLiter=" + fuelPerLiter + ", isElectric=" + isElectric
				+ ", engineCapacity=" + engineCapacity + "]";
	}
}