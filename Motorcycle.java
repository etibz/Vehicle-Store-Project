package vehicleStore;

public class Motorcycle extends TwoWheels {
	private char licenseType;
	private int engineCapacity;
	
	public Motorcycle(String licenseNum, String company, int yaer, int price, int numOfWheels
			, boolean isOffRoad, int maxSpeed, char licenseType, int engineCapacity) {
		super(licenseNum, company, yaer, price, numOfWheels,  isOffRoad, maxSpeed);
		this.licenseType = licenseType;
		this.engineCapacity = engineCapacity;
	}
	public char getLicenseType() {
		return licenseType;
	}
	public void setLicenseType(char licenseType) {
		this.licenseType = licenseType;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public void printLicenseNum() {
		System.out.println("This is Motorcycle:");
		super.printLicenseNum();
	}
	@Override
	public String toString() {
		return super.toString()+"Motorcycle [licenseType=" + licenseType + ", engineCapacity=" + engineCapacity + "]";
	}
}