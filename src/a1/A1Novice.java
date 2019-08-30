package a1;

import java.util.Scanner;
import java.util.ArrayList;

public class A1Novice {

	public static void main(String[] args) {
		ArrayList<String> finalList = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		int customers = scan.nextInt();
		String finalString = "";
		

		for(int i = 0; i < customers; i++) {		
			double total = 0.0;
			String fname = scan.next();
			char firstInit = fname.charAt(0);
			String lname = scan.next();
			int items = scan.nextInt();
			
			for(int j = 0; j < items; j++) {
				int num = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
				total += price*num;
			}
			finalString = firstInit + ". " + lname + ": " + String.format("%.2f", total);
			finalList.add(finalString);
		}
		
		for(int k = 0; k < customers; k++) {
			System.out.println(finalList.get(k)); //fix it so final shows up later
		}
	}
}
