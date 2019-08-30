package a1;

import java.util.Scanner;
import java.util.ArrayList;
public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int itemTotal = scan.nextInt();
		
		ArrayList<String> itemNames = new ArrayList<String>();
		ArrayList<Double> prices = new ArrayList<Double>();
		
		for(int i = 0; i < itemTotal; i++)
		{
			String itemName = scan.next();
			double price = scan.nextDouble();
			
			itemNames.add(itemName);
			prices.add(price);
		}
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Double> bills = new ArrayList<Double>();
		
		int customers = scan.nextInt();
		for (int j = 0; j < customers; j++)
		{
			double cTotal = 0.0;
			String fname = scan.next();
			String lname = scan.next();
			int cItems = scan.nextInt();
			for (int k = 0; k < cItems; k++)
			{
				int numItems = scan.nextInt();
				String itemCall = scan.next();
				for(int l = 0; l < itemNames.size(); l++)
				{
					if(itemCall.equalsIgnoreCase(itemNames.get(l)))
					{
						cTotal += prices.get(l)*numItems;
					}
				}
			}
			names.add(fname + " " + lname);
			bills.add(cTotal);
			
		}
		
		//find max bill
		double maxBill = bills.get(0);
		int maxIndex = 0;
		for(int mc = 0; mc < bills.size(); mc++)
		{
			if(bills.get(mc) >= maxBill)
			{
				maxBill = bills.get(mc);
				maxIndex = mc;
			}
		}
		
		//find min bill
		double minBill = bills.get(0);
		int minIndex = 0;
		for(int mc = 0; mc < bills.size(); mc++)
		{
			if(bills.get(mc) <= minBill)
			{
				minBill = bills.get(mc);
				minIndex = mc;
			}
		}
		
		//find average bill
		double avg = 0.0;
		for(int num = 0; num < bills.size(); num++)
		{
			avg += bills.get(num);
		}
		avg = avg/bills.size();
		
		System.out.println("Biggest: " + names.get(maxIndex) + " (" + String.format("%.2f", maxBill) + ")"); //fix
		System.out.println("Smallest: "+ names.get(minIndex) + " (" + String.format("%.2f", minBill) + ")"); //fix
		System.out.println("Average: " + String.format("%.2f", avg));
	
		
	}
}
