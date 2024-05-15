package vehicleStore;

public class Truck extends Car  {
	private int maxWeight;
	private double len;

	public Truck(String licenseNum, String company, int yaer, int price, int numOfWheels,
			int numOfSeats, int fuelPerLiter, boolean isElectric, int engineCapacity, int maxWeight, double len) {
		super(licenseNum, company, yaer, price, numOfWheels, numOfSeats, fuelPerLiter, isElectric,
				engineCapacity);
		this.maxWeight = maxWeight;
		this.len = len;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getLen() {
		return len;
	}

	public void setLen(double len) {
		this.len = len;
	}
	public void printLicenseNum() {
		System.out.println("This is Trunck:");
		super.printLicenseNum();
	}

	@Override
	public String toString() {
		return super.toString()+"Truck [maxWeight=" + maxWeight + ", len=" + len + "]";
	}
}