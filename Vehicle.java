package vehicleStore;

public class Vehicle {
	protected String licenseNum;
	protected String company;
	protected int yaer;
	protected int price;
	protected  int numOfWheels;
	protected VehicleStore vehicleStore;
	
	public Vehicle(String licenseNum, String company, int yaer, int price, int numOfWheels) {
		super();
		this.licenseNum = licenseNum;
		this.company = company;
		this.yaer = yaer;
		this.price = price;
		this.numOfWheels = numOfWheels;
	}
	public String getLicenseNum() {
		return licenseNum;
	}
	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getYaer() {
		return yaer;
	}
	public void setYaer(int yaer) {
		this.yaer = yaer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	public VehicleStore getVehicleStore() {
		return vehicleStore;
	}
	public void setVehicleStore(VehicleStore vs) {
		if(this.vehicleStore==null)this.vehicleStore=vs;
		if(this.vehicleStore!=vs) {
			this.vehicleStore.removeVehicle(this);
			this.vehicleStore=vs;
		}	
	}
	public void printLicenseNum() {
		System.out.println(this.licenseNum);
	}
	@Override
	public String toString() {
		return "Vehicle [licenseNum=" + licenseNum + ", company=" + company + ", yaer=" + yaer + ", price=" + price
				+ ", numOfWheels=" + numOfWheels + ", vehicleStore=" + vehicleStore + "]";
	}
}