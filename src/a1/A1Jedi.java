package a1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int itemTotal = scan.nextInt();
		
		ArrayList<String> itemNames = new ArrayList<String>();
		ArrayList<Integer> itemCounts = new ArrayList<Integer>();
		ArrayList<Double> prices = new ArrayList<Double>();
		ArrayList<Integer> custCounts = new ArrayList<Integer>();
		
		for(int i = 0; i < itemTotal; i++)
		{
			String itemName = scan.next();
			double price = scan.nextDouble();
			
			itemNames.add(itemName);
			prices.add(price);
			itemCounts.add(0);
			custCounts.add(0);
		}
		
		int customers = scan.nextInt();
		for (int j = 0; j < customers; j++)
		{
			//double cTotal = 0.0;
			String fname = scan.next();
			String lname = scan.next();
			int cItems = scan.nextInt();
			
			for (int k = 0; k < cItems; k++)
			{
				int numItems = scan.nextInt();
				String itemCall = scan.next();
				
				for(int l = 0; l < itemNames.size(); l++)
				{	
					//boolean alreadyThere = false; //fix boolean placement to prevent repeats
					System.out.println(itemCall.equalsIgnoreCase(itemNames.get(l)));
					if(itemCall.equalsIgnoreCase(itemNames.get(l)))
					{
						//cTotal += prices.get(l)*numItems;
						
						int temp = itemCounts.get(l);
						
						temp += numItems;
						itemCounts.set(l, temp);
						
						
						//if(alreadyThere == false)
						//{
							int temp2 = custCounts.get(l);
							temp2 += 1;
							custCounts.set(l, temp2);
							
							//System.out.println(itemCounts);
							break;
							//alreadyThere = true;
						//}
					}
				}
			}
		}
		
		String custString = "No";
		String itemString = "";
		
			
		for(int p = 0; p < itemCounts.size(); p++)
		{	
			//tells total number of customers who bought the item
			if(custCounts.get(p) != 0)
			{
				custString = custCounts.get(p) + "";
			}
			else
			{
				custString = "No";
			}
			
			//tells total number of items bought
			if(itemCounts.get(p) != 0)
			{
				itemString = itemCounts.get(p) + " ";
			}
			else
			{
				itemString = "";
			}
			System.out.println(custString + " customers bought " + itemString + itemNames.get(p));
		}
		
		
		
	}
}
