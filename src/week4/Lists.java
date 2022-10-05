package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {

	public static void main(String[] args) {
		/* List<E> list of E in which E is the generic that will be replaced with the type
		 * List<String> reads as "List of String"
		 */
		List<String> vehicleBrands = new ArrayList<String>();
		vehicleBrands.add("Honda");
		vehicleBrands.add("Toyota");
		vehicleBrands.add("Lexus");
		vehicleBrands.add("Ford");
		vehicleBrands.add("Chevrolet");
		vehicleBrands.add("Chrysler");
		vehicleBrands.add("Corvette");
		vehicleBrands.add("Cadillac");
		vehicleBrands.add("Nissan");
		vehicleBrands.add("BMW");
		vehicleBrands.add("Mercedes-Benz");
		vehicleBrands.add("Tesla");
		vehicleBrands.add("Kia");
		vehicleBrands.add("Buick");
		vehicleBrands.add("Jeep");
		vehicleBrands.add("Dodge");
		vehicleBrands.add("GMC");
		vehicleBrands.add("Hyundai");
		vehicleBrands.add("Jaguar");
		vehicleBrands.add("McLaren");
		vehicleBrands.add("Ferrari");
		vehicleBrands.add("Koenigsegg");
		vehicleBrands.add("Aston Martin");
		vehicleBrands.add("Rolls-Royce");
		vehicleBrands.add("Fiat");
		vehicleBrands.add("Tata");
		vehicleBrands.add("General Electric"); // added only to be removed as it is not a vehicle brand
		vehicleBrands.remove(26); // method to remove element from list
		
		
//		for (int i = 0; i < vehicleBrands.size(); i++) {
//		System.out.println(vehicleBrands.get(i));
//	}
		
		boolean commonInUS = true;
		if (commonInUS) {
			for (int i = 0; i < vehicleBrands.size() - 8; i++) {
				System.out.println(vehicleBrands.get(i));			
			}
		} else {
			for (String vehicleBrand : vehicleBrands) {
			System.out.println(vehicleBrand);
			}
		}
	}
}
