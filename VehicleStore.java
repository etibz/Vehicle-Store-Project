package vehicleStore;

import java.util.Arrays;

public class VehicleStore {
	private String name;
	private Vehicle[]vehicles;
	private int cnt;
	private int monthSales;
	
	public VehicleStore(String name, int monthSales) {
		super();
		this.name = name;
		this.cnt=0;
		this.vehicles = new Vehicle[cnt];
		this.monthSales = monthSales;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle[] getVehicles() {
		return vehicles;
	}
	public boolean addVehicle(Vehicle v) {
		if(v==null)return false;
		for(int i=0;i<this.cnt;i++)
			if(this.vehicles[i].toString().equals(v.toString()))return false;
		this.vehicles=Arrays.copyOf(vehicles,cnt+1);
		vehicles[cnt++]=v;
		v.setVehicleStore(this);
		return true;
	}
	public boolean removeVehicle(Vehicle v) {
		if(v==null)return false;
		boolean flag=false;
		for(int i=0;i<cnt;i++) {
			if(vehicles[i].getLicenseNum().equals(v.getLicenseNum())) {
				flag=true ;
				break;
			}
		}
		if(!flag)return false;
		int cnt=0;
		Vehicle[]temp=new Vehicle[this.cnt-1];
		for(int i=0;i<vehicles.length;i++) {
			if(!vehicles[i].getLicenseNum().equals(v.getLicenseNum())) 
				temp[cnt++]=vehicles[i];	
		}
		vehicles=temp;
		this.cnt--;
		v.setVehicleStore(null);
		return true;
	}
	public int getCnt() {
		return cnt;
	}
	public int getMonthSales() {
		return monthSales;
	}
	public void setMonthSales(int monthSales) {
		this.monthSales = monthSales;
	}
	@Override
	public String toString() {
		return "VehicleStore [name=" + name + ", vehicles=" + Arrays.toString(vehicles) + ", cnt=" + cnt
				+ ", monthSales=" + monthSales + "]";
	}
}