package day25_arrays03;

public class Shopping {
	public static void main(String[] args) {
		String[] products = {"Timberland shoes","H&M Shirt","Swatch Watch","Gucci Bag","Adidas socks"};
		double[] prices = {120.0 , 5.99 , 150.50 , 3000.5 , 6.99};
		int[] itemsId = {12345 , 12346 , 12347 , 12348 , 12349};
		
		//Print count of products
		System.out.println("Products count: "+products.length);
		//check if products, price and itemsIds have same count
		if(products.length==prices.length && products.length==itemsId.length) {
			System.out.println("Shopping list looks good");
			
		}else {
		System.out.println("Something is wrong in this list");
		return;
		}
		
		//loop through products and print each one in separate line.
		for(String prod: products) {
			System.out.println(prod);
		}
		for(int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);	
		}
		for(int j = itemsId.length-1; j >= 0; j--) {
			System.out.println(itemsId[j]);
		}
		System.out.println("############## Your shopping receipt###########");
		double totalPrice = 0.0;
		double mostExpencive = 0.0;
		double mostCheapest = 5000;
		int maxIndex = 0;
		for (int idx = 0; idx < products.length; idx++) {
			System.out.println("Item"+ (idx+1) +": "+ itemsId[idx]+" - " + products[idx] + " - $"+
					prices[idx]);
			totalPrice += prices[idx];
			
			if (prices[idx] > mostExpencive) {
				mostExpencive =  prices[idx];
				maxIndex = idx;
			}
			if (prices[idx] < mostCheapest) {
				mostCheapest = prices[idx];
				
			}
			
		}
		System.out.println("Total Price: $" + totalPrice);
		System.out.println("Most expencive item is " + itemsId[maxIndex]+ " - " + products[maxIndex] + " - $" + mostExpencive);
		// Find the most expensive item.
		
		System.out.println(mostCheapest);
		 
	}
}
