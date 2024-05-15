package vehicleStore;

import java.util.Arrays;

public class Main {
	public static void printVehicle(VehicleStore[] arr) {
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].getCnt(); j++)
				if (arr[i].getVehicles()[j] instanceof Motorcycle)
					if (((Motorcycle) arr[i].getVehicles()[j]).getEngineCapacity() > 125)
						System.out.println(arr[i].getVehicles()[j]);
	}
	public static VehicleStore mostExpensiveCar(VehicleStore[] arr) {
		int sum = 0, maxSum = 0, ind = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].getCnt(); j++)
				sum += arr[i].getVehicles()[j].price;
			if (sum > maxSum) {
				maxSum = sum;
				ind = i;
			}
		}
		return arr[ind];
	}
	public static VehicleStore[] sortedBySales(VehicleStore[] arr) {
		VehicleStore[] res = new VehicleStore[arr.length];
		VehicleStore[] temp = Arrays.copyOf(arr, arr.length);
		int cnt = 0, max = 0, ind = 0;
		while (cnt < res.length) {
			max = 0;
			for (int i = 0; i < temp.length; i++) {
				if (temp[i].getMonthSales() > max) {
					max = arr[i].getMonthSales();
					ind = i;
				}
			}
			res[cnt++] = temp[ind];
			temp[ind].setMonthSales(-1);
		}
		return res;
	}
	public static VehicleStore[] sortedBySales2(VehicleStore[] arr) {
		VehicleStore[] res = new VehicleStore[arr.length];
		int cnt = 0, max = arr[0].getMonthSales(), ind = 0, i = 0;
		VehicleStore[] temp = Arrays.copyOf(arr, arr.length);
		while (true) {
			if (cnt >= res.length)
				break;
			if (i == temp.length) {
				res[cnt++] = temp[ind];
				max = 0;
				i = 0;
				temp[ind].setMonthSales(-1);
				ind = 0;
			}
			if (temp[i].getMonthSales() > max) {
				max = temp[i].getMonthSales();
				ind = i;
			}
			i++;
		}
		return res;
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle("123", "as", 2024, 600000, 4);
		v.printLicenseNum();
	}
}