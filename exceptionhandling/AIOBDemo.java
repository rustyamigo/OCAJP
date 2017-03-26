class AIOBDemo {
	public static void main(String[] args) {
		 // String [] names = new String[]; // COMPILE ERROR - Arrays Dimensions are MUST
		 // String [] names = new String[-1]; // NegativeArraySizeException
		 // String [] names = new String[0]; // COMPILE PERFECTLY
		 // Use with above throws ArrayIndexOutOfBoundsException		
		 // System.out.println(names[0]);  
		 
		 String [] names = new String[1];
		 System.out.println(names[0]); // null 
	}
}