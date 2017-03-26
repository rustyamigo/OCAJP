class ProductNotFoundException extends Exception {}

class Grocery {

	public void findProduct() {
		System.out.println("Finding Product");
	}

}

class SuperMarket extends Grocery {

	// this method may or may not throw ProductNotFoundException
	// COMPILE ERROR - overridden method does not throw ProductNotFoundException
	// in the base class we must provide the throws clause
	// in derived class it is optional and we cannot refer to any super class
	// of exception in throws
	public void findProduct() {
		System.out.println("Finding Product");
	}
	
}


class CallingMethodsExceptionHandling_2 {

	public static void main(String[] args) throws ProductNotFoundException, Exception {
		Grocery grocery = new Grocery();
		try {
			// COMPILE ERROR 
			// unreported exception ProductNotFoundException 
			// must be caught or declared to be thrown
			// if throws or try-catch is not used
			grocery.findProduct();

		}
		// Compile Error - exception ProductNotFoundException is never thrown in body
		// corresponding try statement
		catch(ProductNotFoundException ex) {
			System.out.println(ex);
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		catch(Exception ex) {
			System.out.println(ex);
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}
}